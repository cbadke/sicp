(defn f-recursive [n]
  (if
    (< n 3)
    n
    (+ 
      (f-recursive (- n 1))
      (* 2 (f-recursive (- n 2)))
      (* 3 (f-recursive (- n 3))))))

(println "recursive f(1)"  (f-recursive 1))
(println "recursive f(3)"  (f-recursive 3))
(println "recursive f(8)"  (f-recursive 8))
(println "recursive f(12)" (f-recursive 12))

(defn f-iterative [n]
  (defn f-iter [a, b, c, curr]
    (if (> curr n)
      a
      (f-iter 
        (+ a (* b 2) (* c 3)) 
        a 
        b 
        (+ curr 1))))
  (if (< n 3)
    n
    (f-iter 2 1 0 3)))

(println "recursive f(1)"  (f-iterative 1))
(println "recursive f(3)"  (f-iterative 3))
(println "recursive f(8)"  (f-iterative 8))
(println "recursive f(12)" (f-iterative 12))
