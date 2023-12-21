There is `src/main/resources/db/changelog/db.changelog-master.yaml` master changelog. It refers to multiple changelogs.
There are multiple two files in `src/main/resources/db/changelog/2023` and two changelogs in `src/main/resources/db/changelog/2024`.
Each of changelog have 1 changeset with **same** `author` and `id`.
I expect app to fail because of [issue](https://github.com/liquibase/liquibase/issues/3881), but it works.

To reproduce run `gradlew test`.
Test reports are in `build/reports/tests/test/index.html`.