(ns exercise2)

(defn only-greater-than-five
  "Filter elements that are greater than five."
  [collection]
  (filter (fn [x] (> x 5)) collection))

