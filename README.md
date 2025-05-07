# Aggregate Example

Simple example of aggregating html reports with pitest.

To produce an aggregated report run

```bash
mvn test org.pitest:pitest-maven:mutationCoverage
mvn org.pitest:pitest-maven:report-aggregate-module
```

Report will be available in target dir.

## Notes

Aggregation requires

* XML output to be enabled
* exportLineCoverage set to true

Cross module tests are not fully supported when aggregating html reports. Proper result consolidation is available when using arcmutate's git/ci integration.
