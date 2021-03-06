(ns {{name}}.core-test
  (:require [clojure.test :refer :all]
            [{{name}}.core :refer :all]))

(deftest home-test
  (testing "home route"
    (let [response (app {:uri "/" :request-method :get})]
      (is (= (:status response) 200)))))

(deftest not-found-test
  (testing "not-found route"
    (let [response (app {:uri "/not-found" :request-method :get})]
      (is (= (:status response) 404)))))
