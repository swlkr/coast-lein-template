(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :min-lein-version "2.6.1"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [coast "0.3.1"]]
  :repl-options {:init-ns {{name}}.core}
  :plugins [[lein-environ "1.1.0"]]
  :source-paths ["src"]
  :test-paths ["test"]
  :aliases {"db/migrate"   ["run" "-m" "coast.migrations/migrate"]
            "db/rollback"  ["run" "-m" "coast.migrations/rollback"]
            "db/migration" ["run" "-m" "coast.migrations/create"]
            "db/crud"      ["run" "-m" "coast.db/crud"]
            "db/create"    ["run" "-m" "coast.db/create" "{{sanitized}}_dev"]
            "db/drop"      ["run" "-m" "coast.db/drop" "{{sanitized}}_dev"]

            "gen/model"      ["run" "-m" "coast.generators/model" "{{sanitized}}"]
            "gen/controller" ["run" "-m" "coast.generators/controller" "{{sanitized}}"]
            "gen/view"       ["run" "-m" "coast.generators/view" "{{sanitized}}"]
            "gen/mvc"        ["run" "-m" "coast.generators/mvc" "{{sanitized}}"]})
