###### Class com.fasterxml.jackson.core.io.schubfach.DoubleToDecimal (com.fasterxml.jackson.core.io.schubfach.DoubleToDecimal)
.class public final Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final MAX_CHARS:I

.field private final bytes:[B

.field private index:I


# direct methods
.method private constructor <init>()V
    .registers 2

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x18

    .line 115
    iput v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->MAX_CHARS:I

    .line 118
    new-array v0, v0, [B

    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->bytes:[B

    return-void
.end method

.method private append(I)V
    .registers 4

    .line 584
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->bytes:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->index:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->index:I

    int-to-byte p0, p1

    aput-byte p0, v0, v1

    return-void
.end method

.method private append8Digits(I)V
    .registers 4

    .line 522
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->y(I)I

    move-result p1

    const/4 v0, 0x0

    :goto_5
    const/16 v1, 0x8

    if-ge v0, v1, :cond_17

    mul-int/lit8 p1, p1, 0xa

    ushr-int/lit8 v1, p1, 0x1c

    .line 525
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    const v1, 0xfffffff

    and-int/2addr p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_17
    return-void
.end method

.method private appendDigit(I)V
    .registers 4

    .line 588
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->bytes:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->index:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->index:I

    add-int/lit8 p1, p1, 0x30

    int-to-byte p0, p1

    aput-byte p0, v0, v1

    return-void
.end method

.method private charsToString()Ljava/lang/String;
    .registers 4

    .line 594
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->bytes:[B

    iget p0, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->index:I

    add-int/lit8 p0, p0, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, p0}, Ljava/lang/String;-><init>([BIII)V

    return-object v0
.end method

.method private exponent(I)V
    .registers 5

    const/16 v0, 0x45

    .line 555
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->append(I)V

    if-gez p1, :cond_d

    const/16 v0, 0x2d

    .line 557
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->append(I)V

    neg-int p1, p1

    :cond_d
    const/16 v0, 0xa

    if-ge p1, v0, :cond_15

    .line 561
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    return-void

    :cond_15
    const/16 v1, 0x64

    if-lt p1, v1, :cond_22

    mul-int/lit16 v2, p1, 0x51f

    ushr-int/lit8 v2, v2, 0x11

    .line 571
    invoke-direct {p0, v2}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    mul-int/2addr v2, v1

    sub-int/2addr p1, v2

    :cond_22
    mul-int/lit8 v1, p1, 0x67

    ushr-int/2addr v1, v0

    .line 579
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    mul-int/2addr v1, v0

    sub-int/2addr p1, v1

    .line 580
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    return-void
.end method

.method private lowDigits(I)V
    .registers 2

    if-eqz p1, :cond_5

    .line 512
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->append8Digits(I)V

    .line 514
    :cond_5
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->removeTrailingZeroes()V

    return-void
.end method

.method private removeTrailingZeroes()V
    .registers 4

    .line 531
    :goto_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->bytes:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->index:I

    aget-byte v0, v0, v1

    const/16 v2, 0x30

    if-ne v0, v2, :cond_f

    add-int/lit8 v1, v1, -0x1

    .line 532
    iput v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->index:I

    goto :goto_0

    :cond_f
    const/16 v2, 0x2e

    if-ne v0, v2, :cond_17

    add-int/lit8 v1, v1, 0x1

    .line 536
    iput v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->index:I

    :cond_17
    return-void
.end method

.method private static rop(JJJ)J
    .registers 8

    .line 402
    invoke-static {p2, p3, p4, p5}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->multiplyHigh(JJ)J

    move-result-wide p2

    .line 404
    invoke-static {p0, p1, p4, p5}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->multiplyHigh(JJ)J

    move-result-wide v0

    mul-long/2addr p0, p4

    const/4 p4, 0x1

    ushr-long/2addr p0, p4

    add-long/2addr p0, p2

    const/16 p2, 0x3f

    ushr-long p3, p0, p2

    add-long/2addr v0, p3

    const-wide p3, 0x7fffffffffffffffL

    and-long/2addr p0, p3

    add-long/2addr p0, p3

    ushr-long/2addr p0, p2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method private toChars(JI)I
    .registers 8

    .line 420
    invoke-static {p1, p2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x40

    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->flog10pow2(I)I

    move-result v0

    .line 421
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->pow10(I)J

    move-result-wide v1

    cmp-long v1, p1, v1

    if-ltz v1, :cond_14

    add-int/lit8 v0, v0, 0x1

    :cond_14
    rsub-int/lit8 v1, v0, 0x11

    .line 431
    invoke-static {v1}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->pow10(I)J

    move-result-wide v1

    mul-long/2addr p1, v1

    add-int/2addr p3, v0

    const-wide v0, 0x2af31dc4611873cL    # 9.53972865917246E-296

    .line 448
    invoke-static {p1, p2, v0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->multiplyHigh(JJ)J

    move-result-wide v0

    const/16 v2, 0x14

    ushr-long/2addr v0, v2

    const-wide/32 v2, 0x5f5e100

    mul-long/2addr v2, v0

    sub-long/2addr p1, v2

    long-to-int p1, p1

    const-wide/32 v2, 0x55e63b89

    mul-long/2addr v2, v0

    const/16 p2, 0x39

    ushr-long/2addr v2, p2

    long-to-int p2, v2

    const v2, 0x5f5e100

    mul-int/2addr v2, p2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    if-lez p3, :cond_47

    const/4 v1, 0x7

    if-gt p3, v1, :cond_47

    .line 454
    invoke-direct {p0, p2, v0, p1, p3}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toChars1(IIII)I

    move-result p0

    return p0

    :cond_47
    const/4 v1, -0x3

    if-ge v1, p3, :cond_51

    if-gtz p3, :cond_51

    .line 457
    invoke-direct {p0, p2, v0, p1, p3}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toChars2(IIII)I

    move-result p0

    return p0

    .line 459
    :cond_51
    invoke-direct {p0, p2, v0, p1, p3}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toChars3(IIII)I

    move-result p0

    return p0
.end method

.method private toChars1(IIII)I
    .registers 7

    .line 468
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    .line 469
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->y(I)I

    move-result p1

    const/4 p2, 0x1

    :goto_8
    const v0, 0xfffffff

    if-ge p2, p4, :cond_18

    mul-int/lit8 p1, p1, 0xa

    ushr-int/lit8 v1, p1, 0x1c

    .line 474
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    and-int/2addr p1, v0

    add-int/lit8 p2, p2, 0x1

    goto :goto_8

    :cond_18
    const/16 p4, 0x2e

    .line 477
    invoke-direct {p0, p4}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->append(I)V

    :goto_1d
    const/16 p4, 0x8

    if-gt p2, p4, :cond_2c

    mul-int/lit8 p1, p1, 0xa

    ushr-int/lit8 p4, p1, 0x1c

    .line 480
    invoke-direct {p0, p4}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    and-int/2addr p1, v0

    add-int/lit8 p2, p2, 0x1

    goto :goto_1d

    .line 483
    :cond_2c
    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->lowDigits(I)V

    const/4 p0, 0x0

    return p0
.end method

.method private toChars2(IIII)I
    .registers 7

    const/4 v0, 0x0

    .line 489
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    const/16 v1, 0x2e

    .line 490
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->append(I)V

    :goto_9
    if-gez p4, :cond_11

    .line 492
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_9

    .line 494
    :cond_11
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    .line 495
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->append8Digits(I)V

    .line 496
    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->lowDigits(I)V

    return v0
.end method

.method private toChars3(IIII)I
    .registers 5

    .line 502
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->appendDigit(I)V

    const/16 p1, 0x2e

    .line 503
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->append(I)V

    .line 504
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->append8Digits(I)V

    .line 505
    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->lowDigits(I)V

    add-int/lit8 p4, p4, -0x1

    .line 506
    invoke-direct {p0, p4}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->exponent(I)V

    const/4 p0, 0x0

    return p0
.end method

.method private toDecimal(D)I
    .registers 10

    .line 272
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    const-wide v0, 0xfffffffffffffL

    and-long/2addr v0, p1

    const/16 v2, 0x34

    ushr-long v2, p1, v2

    long-to-int v2, v2

    const/16 v3, 0x7ff

    and-int/2addr v2, v3

    const-wide/16 v4, 0x0

    if-ge v2, v3, :cond_69

    const/4 v3, -0x1

    .line 276
    iput v3, p0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->index:I

    cmp-long p1, p1, v4

    if-gez p1, :cond_22

    const/16 p2, 0x2d

    .line 278
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->append(I)V

    :cond_22
    const/4 p2, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4b

    rsub-int p1, v2, 0x433

    const-wide/high16 v2, 0x10000000000000L

    or-long/2addr v0, v2

    if-lez p1, :cond_2f

    move v2, p2

    goto :goto_30

    :cond_2f
    move v2, v6

    :goto_30
    const/16 v3, 0x35

    if-lt p1, v3, :cond_35

    move p2, v6

    :cond_35
    and-int/2addr p2, v2

    if-eqz p2, :cond_45

    shr-long v2, v0, p1

    shl-long v4, v2, p1

    cmp-long p2, v4, v0

    if-nez p2, :cond_45

    .line 288
    invoke-direct {p0, v2, v3, v6}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toChars(JI)I

    move-result p0

    return p0

    :cond_45
    neg-int p1, p1

    .line 291
    invoke-direct {p0, p1, v0, v1, v6}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toDecimal(IJI)I

    move-result p0

    return p0

    :cond_4b
    cmp-long v2, v0, v4

    if-eqz v2, :cond_64

    const-wide/16 p1, 0x3

    cmp-long p1, v0, p1

    const/16 p2, -0x432

    if-gez p1, :cond_5f

    const-wide/16 v4, 0xa

    mul-long/2addr v0, v4

    .line 296
    invoke-direct {p0, p2, v0, v1, v3}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toDecimal(IJI)I

    move-result p0

    return p0

    .line 297
    :cond_5f
    invoke-direct {p0, p2, v0, v1, v6}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toDecimal(IJI)I

    move-result p0

    return p0

    :cond_64
    if-nez p1, :cond_67

    return p2

    :cond_67
    const/4 p0, 0x2

    return p0

    :cond_69
    cmp-long p0, v0, v4

    if-eqz p0, :cond_6f

    const/4 p0, 0x5

    return p0

    :cond_6f
    cmp-long p0, p1, v4

    if-lez p0, :cond_75

    const/4 p0, 0x3

    return p0

    :cond_75
    const/4 p0, 0x4

    return p0
.end method

.method private toDecimal(IJI)I
    .registers 32

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-wide/from16 v2, p2

    long-to-int v4, v2

    const/4 v5, 0x1

    and-int/2addr v4, v5

    const/4 v6, 0x2

    shl-long v7, v2, v6

    const-wide/high16 v9, 0x10000000000000L

    cmp-long v2, v2, v9

    const/4 v3, 0x0

    if-eqz v2, :cond_15

    move v2, v5

    goto :goto_16

    :cond_15
    move v2, v3

    :goto_16
    const/16 v9, -0x432

    if-ne v1, v9, :cond_1c

    move v9, v5

    goto :goto_1d

    :cond_1c
    move v9, v3

    :goto_1d
    or-int/2addr v2, v9

    const-wide/16 v9, 0x2

    const-wide/16 v11, 0x1

    if-eqz v2, :cond_2b

    sub-long v13, v7, v9

    .line 338
    invoke-static/range {p1 .. p1}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->flog10pow2(I)I

    move-result v2

    goto :goto_31

    :cond_2b
    sub-long v13, v7, v11

    .line 342
    invoke-static/range {p1 .. p1}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->flog10threeQuartersPow2(I)I

    move-result v2

    :goto_31
    neg-int v15, v2

    .line 344
    invoke-static {v15}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->flog2pow10(I)I

    move-result v15

    add-int/2addr v1, v15

    add-int/2addr v1, v6

    .line 347
    invoke-static {v2}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->g1(I)J

    move-result-wide v21

    .line 348
    invoke-static {v2}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->g0(I)J

    move-result-wide v23

    shl-long v19, v7, v1

    move-wide/from16 v15, v21

    move-wide/from16 v17, v23

    .line 350
    invoke-static/range {v15 .. v20}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->rop(JJJ)J

    move-result-wide v25

    shl-long v19, v13, v1

    .line 351
    invoke-static/range {v15 .. v20}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->rop(JJJ)J

    move-result-wide v13

    add-long/2addr v7, v9

    shl-long v19, v7, v1

    .line 352
    invoke-static/range {v15 .. v20}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->rop(JJJ)J

    move-result-wide v7

    shr-long v9, v25, v6

    const-wide/16 v15, 0x64

    cmp-long v1, v9, v15

    if-ltz v1, :cond_93

    const-wide v11, 0x19999999999999a0L

    .line 367
    invoke-static {v9, v10, v11, v12}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->multiplyHigh(JJ)J

    move-result-wide v11

    const-wide/16 v15, 0xa

    mul-long/2addr v11, v15

    add-long/2addr v15, v11

    move-wide/from16 v17, v9

    int-to-long v9, v4

    add-long v19, v13, v9

    shl-long v21, v11, v6

    cmp-long v1, v19, v21

    if-gtz v1, :cond_79

    move v1, v5

    goto :goto_7a

    :cond_79
    move v1, v3

    :goto_7a
    shl-long v19, v15, v6

    add-long v19, v19, v9

    cmp-long v9, v19, v7

    if-lez v9, :cond_84

    move v9, v3

    goto :goto_85

    :cond_84
    move v9, v5

    :goto_85
    if-eq v1, v9, :cond_90

    if-eqz v1, :cond_8a

    goto :goto_8b

    :cond_8a
    move-wide v11, v15

    .line 372
    :goto_8b
    invoke-direct {v0, v11, v12, v2}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toChars(JI)I

    move-result v0

    return v0

    :cond_90
    const-wide/16 v9, 0x1

    goto :goto_96

    :cond_93
    move-wide/from16 v17, v9

    move-wide v9, v11

    :goto_96
    add-long v11, v17, v9

    int-to-long v9, v4

    add-long/2addr v13, v9

    shl-long v15, v17, v6

    cmp-long v1, v13, v15

    if-gtz v1, :cond_a2

    move v1, v5

    goto :goto_a3

    :cond_a2
    move v1, v3

    :goto_a3
    shl-long v13, v11, v6

    add-long/2addr v13, v9

    cmp-long v4, v13, v7

    if-gtz v4, :cond_ab

    move v3, v5

    :cond_ab
    if-eq v1, v3, :cond_ba

    if-nez v1, :cond_b1

    move-wide v9, v11

    goto :goto_b3

    :cond_b1
    move-wide/from16 v9, v17

    :goto_b3
    add-int v2, v2, p4

    .line 387
    invoke-direct {v0, v9, v10, v2}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toChars(JI)I

    move-result v0

    return v0

    :cond_ba
    add-long v9, v17, v11

    shl-long v3, v9, v5

    sub-long v25, v25, v3

    const-wide/16 v3, 0x0

    cmp-long v1, v25, v3

    if-ltz v1, :cond_d3

    if-nez v1, :cond_d1

    const-wide/16 v5, 0x1

    and-long v5, v17, v5

    cmp-long v1, v5, v3

    if-nez v1, :cond_d1

    goto :goto_d3

    :cond_d1
    move-wide v9, v11

    goto :goto_d5

    :cond_d3
    :goto_d3
    move-wide/from16 v9, v17

    :goto_d5
    add-int v2, v2, p4

    .line 394
    invoke-direct {v0, v9, v10, v2}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toChars(JI)I

    move-result v0

    return v0
.end method

.method private toDecimalString(D)Ljava/lang/String;
    .registers 3

    .line 244
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toDecimal(D)I

    move-result p1

    if-eqz p1, :cond_21

    const/4 p0, 0x1

    if-eq p1, p0, :cond_1e

    const/4 p0, 0x2

    if-eq p1, p0, :cond_1b

    const/4 p0, 0x3

    if-eq p1, p0, :cond_18

    const/4 p0, 0x4

    if-eq p1, p0, :cond_15

    .line 250
    const-string p0, "NaN"

    return-object p0

    .line 249
    :cond_15
    const-string p0, "-Infinity"

    return-object p0

    .line 248
    :cond_18
    const-string p0, "Infinity"

    return-object p0

    .line 247
    :cond_1b
    const-string p0, "-0.0"

    return-object p0

    .line 246
    :cond_1e
    const-string p0, "0.0"

    return-object p0

    .line 245
    :cond_21
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->charsToString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(D)Ljava/lang/String;
    .registers 3

    .line 240
    new-instance v0, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;-><init>()V

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toDecimalString(D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private y(I)I
    .registers 4

    add-int/lit8 p1, p1, 0x1

    int-to-long p0, p1

    const/16 v0, 0x1c

    shl-long/2addr p0, v0

    const-wide v0, 0x2af31dc4611873cL    # 9.53972865917246E-296

    .line 549
    invoke-static {p0, p1, v0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->multiplyHigh(JJ)J

    move-result-wide p0

    const/16 v0, 0x14

    ushr-long/2addr p0, v0

    long-to-int p0, p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method
