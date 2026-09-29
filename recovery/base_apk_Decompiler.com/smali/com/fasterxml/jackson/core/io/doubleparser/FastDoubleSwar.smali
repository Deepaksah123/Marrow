###### Class com.fasterxml.jackson.core.io.doubleparser.FastDoubleSwar (com.fasterxml.jackson.core.io.doubleparser.FastDoubleSwar)
.class Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .registers 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fma(DDD)D
    .registers 6

    mul-double/2addr p0, p2

    add-double/2addr p0, p4

    return-wide p0
.end method

.method protected static isDigit(C)Z
    .registers 2

    add-int/lit8 p0, p0, -0x30

    int-to-char p0, p0

    const/16 v0, 0xa

    if-ge p0, v0, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public static isEightDigits(Ljava/lang/CharSequence;I)Z
    .registers 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_2
    const/16 v2, 0x8

    if-ge v1, v2, :cond_14

    add-int v2, v1, p1

    .line 87
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 88
    invoke-static {v2}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v2

    and-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_14
    return v0
.end method

.method public static isEightZeroes(Ljava/lang/CharSequence;I)Z
    .registers 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    move v3, v0

    move v2, v1

    :goto_4
    const/16 v4, 0x8

    if-ge v2, v4, :cond_19

    add-int v4, v2, p1

    .line 119
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-ne v5, v4, :cond_14

    move v4, v0

    goto :goto_15

    :cond_14
    move v4, v1

    :goto_15
    and-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_19
    return v3
.end method

.method public static readIntBE([BI)I
    .registers 5

    .line 162
    aget-byte v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, p0, v2

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    and-int/lit16 p1, v0, 0xff

    shl-int/lit8 p1, p1, 0x18

    and-int/lit16 v0, v1, 0xff

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr p1, v0

    and-int/lit16 v0, v2, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr p1, v0

    or-int/2addr p0, p1

    return p0
.end method

.method public static tryToParseEightDigits(Ljava/lang/CharSequence;I)I
    .registers 20

    move-object/from16 v0, p0

    .line 234
    invoke-interface/range {p0 .. p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    int-to-long v1, v1

    add-int/lit8 v3, p1, 0x1

    .line 235
    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    int-to-long v3, v3

    add-int/lit8 v5, p1, 0x2

    .line 236
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    int-to-long v5, v5

    add-int/lit8 v7, p1, 0x3

    .line 237
    invoke-interface {v0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    int-to-long v7, v7

    add-int/lit8 v9, p1, 0x4

    .line 238
    invoke-interface {v0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    int-to-long v9, v9

    add-int/lit8 v11, p1, 0x5

    .line 239
    invoke-interface {v0, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    int-to-long v11, v11

    add-int/lit8 v13, p1, 0x6

    .line 240
    invoke-interface {v0, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    int-to-long v13, v13

    add-int/lit8 v15, p1, 0x7

    .line 241
    invoke-interface {v0, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move-wide/from16 v16, v13

    int-to-long v13, v0

    const/16 v0, 0x10

    shl-long/2addr v3, v0

    or-long/2addr v1, v3

    const/16 v3, 0x20

    shl-long v4, v5, v3

    or-long/2addr v1, v4

    const/16 v4, 0x30

    shl-long v5, v7, v4

    or-long/2addr v1, v5

    shl-long v4, v13, v4

    shl-long v6, v11, v0

    or-long/2addr v6, v9

    shl-long v8, v16, v3

    or-long/2addr v6, v8

    or-long v3, v4, v6

    .line 242
    invoke-static {v1, v2, v3, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseEightDigitsUtf16(JJ)I

    move-result v0

    return v0
.end method

.method public static tryToParseEightDigitsUtf16(JJ)I
    .registers 10

    const-wide v0, 0x30003000300030L

    sub-long v2, p0, v0

    sub-long v0, p2, v0

    const-wide v4, 0x46004600460046L    # 2.447700077935472E-307

    add-long/2addr p0, v4

    or-long/2addr p0, v2

    add-long/2addr p2, v4

    or-long/2addr p2, v0

    or-long/2addr p0, p2

    const-wide p2, -0x7f007f007f0080L

    and-long/2addr p0, p2

    const-wide/16 p2, 0x0

    cmp-long p0, p0, p2

    if-eqz p0, :cond_21

    const/4 p0, -0x1

    return p0

    :cond_21
    const-wide p0, 0x3e80064000a0001L

    mul-long/2addr v0, p0

    const/16 p2, 0x30

    ushr-long/2addr v0, p2

    long-to-int p3, v0

    mul-long/2addr v2, p0

    ushr-long p0, v2, p2

    long-to-int p0, p0

    mul-int/lit16 p0, p0, 0x2710

    add-int/2addr p3, p0

    return p3
.end method

.method public static tryToParseEightHexDigits(Ljava/lang/CharSequence;I)J
    .registers 20

    move-object/from16 v0, p0

    .line 339
    invoke-interface/range {p0 .. p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    int-to-long v1, v1

    add-int/lit8 v3, p1, 0x1

    .line 340
    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    int-to-long v3, v3

    add-int/lit8 v5, p1, 0x2

    .line 341
    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    int-to-long v5, v5

    add-int/lit8 v7, p1, 0x3

    .line 342
    invoke-interface {v0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    int-to-long v7, v7

    add-int/lit8 v9, p1, 0x4

    .line 344
    invoke-interface {v0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    int-to-long v9, v9

    add-int/lit8 v11, p1, 0x5

    .line 345
    invoke-interface {v0, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    int-to-long v11, v11

    add-int/lit8 v13, p1, 0x6

    .line 346
    invoke-interface {v0, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    int-to-long v13, v13

    add-int/lit8 v15, p1, 0x7

    .line 347
    invoke-interface {v0, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move-wide/from16 v16, v13

    int-to-long v13, v0

    const/16 v0, 0x30

    shl-long/2addr v1, v0

    const/16 v15, 0x20

    shl-long/2addr v3, v15

    or-long/2addr v1, v3

    const/16 v3, 0x10

    shl-long v4, v5, v3

    or-long/2addr v1, v4

    or-long/2addr v1, v7

    shl-long v4, v9, v0

    shl-long v6, v11, v15

    or-long/2addr v4, v6

    shl-long v6, v16, v3

    or-long v3, v4, v6

    or-long/2addr v3, v13

    .line 349
    invoke-static {v1, v2, v3, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseEightHexDigitsUtf16(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static tryToParseEightHexDigitsUtf16(JJ)J
    .registers 5

    .line 412
    invoke-static {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseFourHexDigitsUtf16(J)J

    move-result-wide p0

    const/16 v0, 0x10

    shl-long/2addr p0, v0

    .line 413
    invoke-static {p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseFourHexDigitsUtf16(J)J

    move-result-wide p2

    or-long/2addr p0, p2

    return-wide p0
.end method

.method public static tryToParseFourDigits(Ljava/lang/CharSequence;I)I
    .registers 9

    .line 480
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    int-to-long v0, v0

    add-int/lit8 v2, p1, 0x1

    .line 481
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    int-to-long v2, v2

    add-int/lit8 v4, p1, 0x2

    .line 482
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    int-to-long v4, v4

    add-int/lit8 p1, p1, 0x3

    .line 483
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    int-to-long p0, p0

    const/16 v6, 0x30

    shl-long/2addr p0, v6

    const/16 v6, 0x10

    shl-long/2addr v2, v6

    or-long/2addr v0, v2

    const/16 v2, 0x20

    shl-long v2, v4, v2

    or-long/2addr v0, v2

    or-long/2addr p0, v0

    .line 485
    invoke-static {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseFourDigitsUtf16(J)I

    move-result p0

    return p0
.end method

.method public static tryToParseFourDigitsUtf16(J)I
    .registers 6

    const-wide v0, 0x30003000300030L

    sub-long v0, p0, v0

    const-wide v2, 0x46004600460046L    # 2.447700077935472E-307

    add-long/2addr p0, v2

    or-long/2addr p0, v0

    const-wide v2, -0x7f007f007f0080L

    and-long/2addr p0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1c

    const/4 p0, -0x1

    return p0

    :cond_1c
    const-wide p0, 0x3e80064000a0001L

    mul-long/2addr v0, p0

    const/16 p0, 0x30

    ushr-long p0, v0, p0

    long-to-int p0, p0

    return p0
.end method

.method public static tryToParseFourHexDigitsUtf16(J)J
    .registers 10

    const-wide v0, 0x30003000300030L

    sub-long v0, p0, v0

    const-wide v2, 0x7fc67fc67fc67fc6L    # 3.159884238255068E307

    add-long/2addr v2, p0

    const-wide v4, -0x7fff7fff7fff8000L    # -6.9534619092435E-310

    and-long/2addr v2, v4

    const-wide v6, 0x7f9f7f9f7f9f7f9fL    # 5.529754555948075E306

    add-long/2addr p0, v6

    and-long/2addr p0, v4

    const-wide v4, 0x7fff7fff7fff7fffL

    xor-long/2addr v4, v0

    const-wide v6, 0x37003700370037L

    add-long/2addr v4, v6

    and-long/2addr p0, v4

    cmp-long p0, v2, p0

    if-eqz p0, :cond_2e

    const-wide/16 p0, -0x1

    return-wide p0

    :cond_2e
    const/16 p0, 0xf

    ushr-long p0, v2, p0

    const-wide/32 v2, 0xffff

    mul-long/2addr p0, v2

    not-long v4, p0

    and-long/2addr v4, v0

    const-wide v6, 0x27002700270027L

    and-long/2addr p0, v6

    sub-long/2addr v0, p0

    or-long p0, v4, v0

    const/16 v0, 0xc

    ushr-long v0, p0, v0

    or-long/2addr p0, v0

    const/16 v0, 0x18

    ushr-long v0, p0, v0

    or-long/2addr p0, v0

    and-long/2addr p0, v2

    return-wide p0
.end method

.method public static tryToParseUpTo7Digits(Ljava/lang/CharSequence;II)I
    .registers 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    :goto_2
    if-ge p1, p2, :cond_15

    .line 598
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 599
    invoke-static {v2}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v3

    and-int/2addr v1, v3

    mul-int/lit8 v0, v0, 0xa

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x30

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_15
    if-eqz v1, :cond_18

    return v0

    :cond_18
    const/4 p0, -0x1

    return p0
.end method

.method public static writeIntBE([BII)V
    .registers 5

    ushr-int/lit8 v0, p2, 0x18

    int-to-byte v0, v0

    .line 606
    aput-byte v0, p0, p1

    ushr-int/lit8 v0, p2, 0x10

    int-to-byte v0, v0

    add-int/lit8 v1, p1, 0x1

    .line 607
    aput-byte v0, p0, v1

    ushr-int/lit8 v0, p2, 0x8

    int-to-byte v0, v0

    add-int/lit8 v1, p1, 0x2

    .line 608
    aput-byte v0, p0, v1

    int-to-byte p2, p2

    add-int/lit8 p1, p1, 0x3

    .line 609
    aput-byte p2, p0, p1

    return-void
.end method
