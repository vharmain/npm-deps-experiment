(ns ^:figwheel-hooks npm-deps.app
  (:require
   [ol :as ol :refer [Map View]]
   ["ol/layer/Tile" :as tile :refer [default] :rename {default TileLayer}]
   ["ol/source/OSM" :as osm :refer [default] :rename {default OSM}]
   ["ol/proj" :as proj :refer [fromLonLat]]
   [goog.dom :as gdom]))

(set! *warn-on-infer* true)

(def finland (fromLonLat #js[25 64]))

(def map-opts
  #js{:target "map"
      :layers #js[(TileLayer.
                   #js{:source (OSM.)})]
      :view   (View.
               #js{:center finland
                   :zoom   5})})

(defonce app-state (atom (Map. map-opts)))

(defn ^:after-load on-reload []
  (let [omap @app-state]
    ;; TODO update map state
    ))
