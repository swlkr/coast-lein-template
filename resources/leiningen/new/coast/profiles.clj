{:dev {:env {:db-spec-or-url "postgres://localhost:5432/{{sanitized}}_dev"
             ; use this if your db is password protected
             ;:admin-db-spec-or-url "postgres://localhost:5432/postgres"
             :secret "{{dev-secret}}"
             :port "1337"
             :coast-env "dev"}}
 ;; this profile just shows how to configure other jdbc databases
 :sample-jdbc {:env {:db-spec-or-url {:classname "com.mysql.jdbc.Driver" ; must be in classpath
                                      :subprotocol "mysql"
                                      :dbname "{{sanitized}}_sample"
                                      :subname "//127.0.0.1:3306/{{sanitized}}_sample?characterEncoding=UTF-8"
                                      :user "root"
                                      :password "helloworld"}}}
 :test {:env {:db-spec-or-url "postgres://localhost:5432/{{sanitized}}_test"
              ; use this if your db is password protected
              ;:admin-db-spec-or-url "postgres://localhost:5432/postgres"
              :secret "{{test-secret}}"
              :port "1337"
              :coast-env "test"}}}
