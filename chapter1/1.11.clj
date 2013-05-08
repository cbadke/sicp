(defn f-recursive [n]
  (if
    (< n 3)
    n
    (+ 
      (f-recursive (- n 1))
      (* 2 (f-recursive (- n 2)))
      (* 3 (f-recursive (- n 3))))))

(println "recursive " (f-recursive 12))

(defn f-iterative [n]
  (defn f-iter [n] n)
  (f-iter n))

(println "iterative " (f-iterative 12))
