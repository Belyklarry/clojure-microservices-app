(defproject quotes "0.1.0-SNAPSHOT"
  :description "Simple API that returns quotes"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [compojure "1.5.0"]
                 [ring/ring-jetty-adapter "1.4.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler quotes.routes/app}
  :main ^:skip-aot quotes.routes
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[peridot "0.4.3"]
                                      [midje "1.8.3"]]
                       :plugins      [[lein-midje "3.2"]]
                       :aliases      {"test" ["midje"]}}
             })
