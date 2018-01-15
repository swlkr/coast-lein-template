{:dev  {:env {:db-spec-or-url "postgres://localhost:5432/{{sanitized}}_dev"
              :admin-db-spec-or-url "postgres://localhost:5432/{{sanitized}}_dev"
              :secret "{{dev-secret}}"
              :port "1337"
              :coast-env "dev"}}
 ;; this profile just show how to config other jdbc databases.
 :sample-jdbc   {:env 
                    {:db-spec-or-url 
                        {:classname "com.mysql.jdbc.Driver" ; must be in classpath
                         :subprotocol "mysql"
                         :dbname "{{sanitized}}_sample"
                         :subname "//127.0.0.1:3306/{{sanitized}}_sample?characterEncoding=UTF-8"
                         :user "root"
                         :password "helloworld"}}
                    {:admin-db-spec-or-url 
                        {:classname "com.mysql.jdbc.Driver" ; must be in classpath
                         :subprotocol "mysql"
                         :dbname "{{sanitized}}_sample"
                         :subname "//127.0.0.1:3306/{{sanitized}}_sample?characterEncoding=UTF-8"
                         :user "root"
                         :password "helloworld"}}}
 :test {:env {:db-spec-or-url "postgres://localhost:5432/{{sanitized}}_test"
              :admin-db-spec-or-url "postgres://localhost:5432/{{sanitized}}_test"
              :secret "{{test-secret}}"
              :port "1337"
              :coast-env "test"}}}
