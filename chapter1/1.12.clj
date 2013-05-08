(comment
  Pascal's triangle
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
  ...
)

(defn pascal [height]
  (defn prow [row]
    (defn pvalue [y,x]
      (cond
        (= x 1) 1
        (= x y) 1
        :else (+ (pvalue (- y 1) (- x 1)) (pvalue (- y 1) x))))
    (let [positions (range 1 (+ row 1))] 
      (map (partial pvalue row) positions))) 
  (let [rows (range 1 (+ height 1))]
    (map prow rows)))

(println (pascal 5))
