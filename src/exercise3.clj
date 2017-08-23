(ns exercise3)

(defn fibonacci
  "Return element n of fibonacci sequence."
  [n]
  (defn fibonacci_recursive
    [iteration  previous_previous_value previous_value]
    (def new_value (+ previous_previous_value  previous_value))
    (if (= iteration 0)
      new_value
      (fibonacci_recursive (- iteration  1) previous_value new_value)))

  (if (get #{0 1} n)
    n
    (fibonacci_recursive (- n  2) 0 1)))
