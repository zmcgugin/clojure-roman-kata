(ns clojure-roman-kata.core)

(def numeralLookup (sorted-map
  100 "C"
  50  "L"
  40  "XL"
  10  "X"
  9   "IX"
  5   "V"
  4   "IV"
  1   "I"
))

(defn getLargestMatch [value]
  (first (filter #(<= % value) (reverse(keys numeralLookup)))))

(defn concat-symbol [current key]
  (apply str current (get numeralLookup key)))

(defn convert [numerals value]
  (def largestMatch (getLargestMatch value))
  (def currentSymbol (concat-symbol numerals largestMatch))
  (def remaining (- value largestMatch))
  (if (> remaining 0)
    (convert currentSymbol remaining) currentSymbol)
)

(defn -main "Main function thingy" [value]
  (convert "" value)
)







