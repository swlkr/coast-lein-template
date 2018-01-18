(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :min-lein-version "2.6.1"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [coast "0.6.4"]]
  :repl-options {:init-ns {{name}}.core}
  :main {{name}}.core
  :plugins [[lein-environ "1.1.0"]]
  :source-paths ["src"]
  :test-paths ["test"]
  :aliases {"db/migrate"   ["run" "-m" "coast.migrations/migrate"]
            "db/rollback"  ["run" "-m" "coast.migrations/rollback"]
            "db/migration" ["run" "-m" "coast.migrations/create"]
            "db/create"    ["run" "-m" "coast.db/create" "{{sanitized}}"]
            "db/drop"      ["run" "-m" "coast.db/drop" "{{sanitized}}"]

            "model/gen"      ["run" "-m" "coast.generators/model" "{{sanitized}}"]
            "controller/gen" ["run" "-m" "coast.generators/controller" "{{sanitized}}"]
            "view/gen"       ["run" "-m" "coast.generators/view" "{{sanitized}}"]
            "mvc/gen"        ["run" "-m" "coast.generators/mvc" "{{sanitized}}"]
            "sql/gen"        ["run" "-m" "coast.generators/sql" "{{sanitized}}"]}
  :profiles {:uberjar {:aot :all
                       :uberjar-name "{{name}}.jar"}})
