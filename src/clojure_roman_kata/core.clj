(ns clojure-roman-kata.core)

  (defn convert [x y]
    (apply str (repeat x y)))

  (defn -main "Main function thingy" [x]
    (convert x "I"))











