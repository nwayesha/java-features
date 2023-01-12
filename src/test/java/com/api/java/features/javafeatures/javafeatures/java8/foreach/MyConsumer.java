package com.api.java.features.javafeatures.javafeatures.java8.foreach;

import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::" + t);
    }
}