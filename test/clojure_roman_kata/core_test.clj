(ns clojure-roman-kata.core-test
  (:require [clojure.test :refer :all]
            [clojure-roman-kata.core :refer :all]))

(deftest a-test
  (testing "Givin 1 return I"
    (is (= (-main 1) "I"))
))
