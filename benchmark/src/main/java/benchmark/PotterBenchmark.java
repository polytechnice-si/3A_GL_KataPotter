/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package benchmark;

import oo.Basket;
import oo.Cashier;
import org.openjdk.jmh.annotations.*;
import raw.PotterDiscountCalculator;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static oo.Book.*;

//@BenchmarkMode(Mode.SingleShotTime) // Benchmark debug purpose
@BenchmarkMode(Mode.AverageTime)      // Production configuration (avg time in microseconds)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class PotterBenchmark {

    @Benchmark
    public void ooBasics() {
        Cashier cashier = new Cashier();
        cashier.price(new Basket(BOOK1)); cashier.price(new Basket(BOOK2));
        cashier.price(new Basket(BOOK3)); cashier.price(new Basket(BOOK4));
        cashier.price(new Basket(BOOK5));
    }

    @Benchmark
    public void rawBasics() {
        PotterDiscountCalculator calculator = new PotterDiscountCalculator();
        calculator.calculatePrice(Arrays.asList(1));
    }

    @Benchmark
    public void ooDiscount() {
        Cashier cashier = new Cashier();
        Basket b = new Basket( BOOK1, BOOK2, BOOK3, BOOK4, BOOK5);
        cashier.price(b);
    }

    @Benchmark
    public void rawDiscount() {
        PotterDiscountCalculator calculator = new PotterDiscountCalculator();
        calculator.calculatePrice(Arrays.asList(1,2,3,4,5));
    }

    @Benchmark
    public void ooEdge() {
        Cashier cashier = new Cashier();
        Basket allin = new Basket(
                BOOK1, BOOK1, BOOK1, BOOK1, BOOK1, BOOK2, BOOK2, BOOK2, BOOK2, BOOK2,
                BOOK3, BOOK3, BOOK3, BOOK3, BOOK4, BOOK4, BOOK4, BOOK4, BOOK4, BOOK5, BOOK5, BOOK5, BOOK5 );
        cashier.price(allin);
    }

    @Benchmark
    public void rawEdge() {
        PotterDiscountCalculator calculator = new PotterDiscountCalculator();
        List<Integer> contents = Arrays.asList(1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5);
        calculator.calculatePrice(contents);
    }

}
