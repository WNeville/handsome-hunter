(defproject handsome-hunter "0.1.0-SNAPSHOT"
  :description "Diversify your Bloodborne runs"
  :url "https://github.com/peatsheep/handsome-hunter"
  :license {:name "GNU GPLv3"
            :url "https://opensource.org/licenses/GPL-3.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot handsome-hunter.rundomizer
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
