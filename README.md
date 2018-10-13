# Openlayers (ES6) with figwheel-main and :npm-deps

Trying out ClojureScript's experimental
[:npm-deps](https://cljs.github.io/api/compiler-options/npm-deps)
compiler option with [OpenLayers](http://openlayers.org/) ES6 modules.

## Overview

Project was created using
[figwheel-main-template](https://rigsomelight.com/figwheel-main-template/). Includes
also setup that works with Cider.

Sources of information:
* https://figwheel.org/docs/compile_config.html
* https://clojurescript.org/news/2017-07-12-clojurescript-is-not-an-island-integrating-node-modules
* https://dev.clojure.org/jira/browse/CLJS-2376
* https://github.com/arichiardi/figwheel-main-cider

## Development

To hook into cider use simply:

`M-x cider-jack-in-cljs`

How it works? See [.dir-locals.el](.dir-locals.el)

To get an interactive development environment run:

    clojure -A:fig:build

To create a production build run:

	rm -rf target/public
    clojure -A:fig:min-simple

Sadly OpenLayers breaks under :advanced optimizations. Following
compiles but map doesn't load properly:

    clojure -A:fig:min
