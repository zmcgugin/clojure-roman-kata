(ns clojure-roman-kata.core-test
  (:require [clojure.test :refer :all]
            [clojure-roman-kata.core :refer :all]))

(deftest a-test
  (testing "Givin 1 return I"
    (is (= (-main 1) "I"))))

(deftest a-test2
  (testing "Givin 2 return II"
    (is (= (-main 2) "II"))))

(deftest a-test3
  (testing "Givin 5 return V"
    (is (= (-main 5) "V"))))