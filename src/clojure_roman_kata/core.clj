(ns clojure-roman-kata.core)

(def symbolMap (sorted-map
  5 "V"
  1 "I"
))

(defn getKeyForBiggestMatch [value]
  (first (filter #(<= % @value) (reverse(keys symbolMap))))
)

(defn searchForHighestMatch [remaining]
  (def biggest (getKeyForBiggestMatch remaining))
  (reset! remaining (- @remaining biggest))
  (get symbolMap biggest)
)

(defn convert [value]
  (def finalString (atom ""))
  (def remaining (atom value))
  (while (> @remaining 0)
    (def partialS (apply str (searchForHighestMatch remaining)))
    (reset! finalString (apply str @finalString partialS)))
  @finalString
)


(defn -main "Main function thingy" [value]
  (convert value)
)










