{:dev  {:env {:database-url "postgres://localhost:5432/{{sanitized}}_dev"
              :secret "{{dev-secret}}"
              :port "1337"}}
 :test {:env {:database-url "postgres://localhost:5432/{{sanitized}}_test"
              :secret "{{test-secret}}"
              :port "1337"}}}
