(defn sum-squares [x, y]
  (+ (* x x) (* y y)))

(defn sum-largest-squares [x, y, z]
  (cond (and (< x y) (< x z)) (sum-squares y z)
        (and (< y x) (< y z)) (sum-squares x z)
        :else (sum-squares x y)))

(defn sum-largest-squares2 [x, y, z]
  (if 
    (and (< x y) (< x z))
    (sum-squares y z)
    (if 
      (< y z) 
      (sum-squares x z)
      (sum-squares x y))))
