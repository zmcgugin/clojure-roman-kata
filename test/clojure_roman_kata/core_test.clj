(ns clojure-roman-kata.core-test
  (:require [clojure.test :refer :all]
            [clojure-roman-kata.core :refer :all]))

(deftest a-test
  (testing "Given 1 return I"
    (is (= (-main 1) "I"))))

(deftest a-test2
  (testing "Given 2 return II"
    (is (= (-main 2) "II"))))

(deftest a-test3
  (testing "Given 5 return V"
    (is (= (-main 5) "V"))))

(deftest a-test4
  (testing "Given 6 return V"
    (is (= (-main 6) "VI"))))

(deftest a-test5
  (testing "Given 4 return IV"
    (is (= (-main 4) "IV"))))