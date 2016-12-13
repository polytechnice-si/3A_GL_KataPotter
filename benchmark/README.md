# Individual Benchmarks

  * Raw material in `bechmark.log.txt`

## Benchmark: benchmark.PotterBenchmark.ooBasics

```
Result "ooBasics":
  0.008 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.007, 0.008, 0.022), stdev = 0.002
  CI (99.9%): [0.007, 0.008] (assumes normal distribution)
```

## Benchmark: benchmark.PotterBenchmark.ooDiscount

```
Result "ooDiscount":
  0.012 ±(99.9%) 0.001 ms/op [Average]
  (min, avg, max) = (0.011, 0.012, 0.017), stdev = 0.001
  CI (99.9%): [0.012, 0.012] (assumes normal distribution)
```

## Benchmark: benchmark.PotterBenchmark.ooEdge

```
Result "ooEdge":
  29.504 ±(99.9%) 0.487 ms/op [Average]
  (min, avg, max) = (27.483, 29.504, 46.962), stdev = 2.060
  CI (99.9%): [29.017, 29.991] (assumes normal distribution)
```

## Benchmark: benchmark.PotterBenchmark.rawBasics

```
Result "rawBasics":
  ≈ 10⁻⁴ ms/op
```

## Benchmark: benchmark.PotterBenchmark.rawDiscount

```
Result "rawDiscount":
  ≈ 10⁻⁴ ms/op
```

## Benchmark: benchmark.PotterBenchmark.rawEdge

```
Result "rawEdge":
  ≈ 10⁻⁴ ms/op
```

# Run complete. Total time: 00:40:41

```
Benchmark                    Mode  Cnt   Score    Error  Units
PotterBenchmark.ooBasics     avgt  200   0.008 ±  0.001  ms/op
PotterBenchmark.ooDiscount   avgt  200   0.012 ±  0.001  ms/op
PotterBenchmark.ooEdge       avgt  200  29.504 ±  0.487  ms/op
PotterBenchmark.rawBasics    avgt  200  ≈ 10⁻⁴           ms/op
PotterBenchmark.rawDiscount  avgt  200  ≈ 10⁻⁴           ms/op
PotterBenchmark.rawEdge      avgt  200  ≈ 10⁻⁴           ms/op
```