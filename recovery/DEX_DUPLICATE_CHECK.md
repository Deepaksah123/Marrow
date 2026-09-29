# Recovery Layer Verification

## DEX duplication check

The five DEX files under `native_code/` are byte-identical to the corresponding files under `apk_exact/`.

| File | SHA-256 | Result |
|---|---|---|
| classes.dex | fc551d642aa7f705c97b19780c2aee7294b9dc4e806f112a6d71d0b0f5865fbd | MATCH |
| classes2.dex | c5c93f7935c52e0a1541ef67d4853abf72f1f57af74b970543cc3d03eb963d1d | MATCH |
| classes3.dex | d599ab800c8fd137db32f77d4143126aef8dba2b225310026e9ab4d5135f4d91 | MATCH |
| classes4.dex | ea1332b17c88bd7b39a9380019418851d0b28ce9972c4eab9a56810153bdbff3 | MATCH |
| classes5.dex | 8e9f3b545b9606196465b066273a5b49c5f9e8ade68d63d84d31391fff0339c2 | MATCH |

**Conclusion:** `native_code/classes*.dex` is a duplicate inspection copy, not an independent recovered code layer. The canonical copies remain under `apk_exact/`.

This prevents us from accidentally treating duplicated DEX files as missing/recovered variants during later reconciliation.
