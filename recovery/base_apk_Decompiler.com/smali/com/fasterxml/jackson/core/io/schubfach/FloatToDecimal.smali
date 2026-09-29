###### Class com.fasterxml.jackson.core.io.schubfach.FloatToDecimal (com.fasterxml.jackson.core.io.schubfach.FloatToDecimal)
.class public final Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final MAX_CHARS:I

.field private final bytes:[B

.field private index:I


# direct methods
.method private constructor <init>()V
    .registers 2

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    .line 114
    iput v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->MAX_CHARS:I

    .line 117
    new-array v0, v0, [B

    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->bytes:[B

    return-void
.end method

.method private append(I)V
    .registers 4

    .line 556
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->bytes:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->index:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->index:I

    int-to-byte p0, p1

    aput-byte p0, v0, v1

    return-void
.end method

.method private append8Digits(I)V
    .registers 4

    .line 504
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->y(I)I

    move-result p1

    const/4 v0, 0x0

    :goto_5
    const/16 v1, 0x8

    if-ge v0, v1, :cond_17

    mul-int/lit8 p1, p1, 0xa

    ushr-int/lit8 v1, p1, 0x1c

    .line 507
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    const v1, 0xfffffff

    and-int/2addr p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_17
    return-void
.end method

.method private appendDigit(I)V
    .registers 4

    .line 560
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->bytes:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->index:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->index:I

    add-int/lit8 p1, p1, 0x30

    int-to-byte p0, p1

    aput-byte p0, v0, v1

    return-void
.end method

.method private charsToString()Ljava/lang/String;
    .registers 4

    .line 566
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->bytes:[B

    iget p0, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->index:I

    add-int/lit8 p0, p0, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, p0}, Ljava/lang/String;-><init>([BIII)V

    return-object v0
.end method

.method private exponent(I)V
    .registers 4

    const/16 v0, 0x45

    .line 537
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->append(I)V

    if-gez p1, :cond_d

    const/16 v0, 0x2d

    .line 539
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->append(I)V

    neg-int p1, p1

    :cond_d
    const/16 v0, 0xa

    if-ge p1, v0, :cond_15

    .line 543
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    return-void

    :cond_15
    mul-int/lit8 v1, p1, 0x67

    ushr-int/2addr v1, v0

    .line 551
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    mul-int/2addr v1, v0

    sub-int/2addr p1, v1

    .line 552
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    return-void
.end method

.method private removeTrailingZeroes()V
    .registers 4

    .line 513
    :goto_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->bytes:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->index:I

    aget-byte v0, v0, v1

    const/16 v2, 0x30

    if-ne v0, v2, :cond_f

    add-int/lit8 v1, v1, -0x1

    .line 514
    iput v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->index:I

    goto :goto_0

    :cond_f
    const/16 v2, 0x2e

    if-ne v0, v2, :cond_17

    add-int/lit8 v1, v1, 0x1

    .line 518
    iput v1, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->index:I

    :cond_17
    return-void
.end method

.method private static rop(JJ)I
    .registers 14

    .line 400
    invoke-static {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->multiplyHigh(JJ)J

    move-result-wide p0

    const/4 p2, 0x0

    int-to-long v0, p2

    const/16 p3, 0x20

    shl-long/2addr v0, p3

    const/4 v2, -0x1

    int-to-long v3, v2

    const/16 v5, 0x3f

    shr-long v6, v3, v5

    shl-long/2addr v6, p3

    sub-long/2addr v3, v6

    or-long/2addr v0, v3

    and-long/2addr v0, p0

    int-to-long v3, p2

    shl-long/2addr v3, p3

    int-to-long v6, v2

    shr-long v8, v6, v5

    shl-long/2addr v8, p3

    sub-long/2addr v6, v8

    or-long v2, v3, v6

    add-long/2addr v0, v2

    ushr-long p2, v0, p3

    const/16 v0, 0x1f

    ushr-long/2addr p0, v0

    or-long/2addr p0, p2

    long-to-int p0, p0

    return p0
.end method

.method private toChars(II)I
    .registers 8

    .line 415
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x20

    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->flog10pow2(I)I

    move-result v0

    int-to-long v1, p1

    .line 416
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->pow10(I)J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-ltz p1, :cond_15

    add-int/lit8 v0, v0, 0x1

    :cond_15
    rsub-int/lit8 p1, v0, 0x9

    .line 426
    invoke-static {p1}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->pow10(I)J

    move-result-wide v3

    mul-long/2addr v1, v3

    long-to-int p1, v1

    add-int/2addr p2, v0

    int-to-long v0, p1

    const-wide/32 v2, 0x55e63b89

    mul-long/2addr v0, v2

    const/16 v2, 0x39

    ushr-long/2addr v0, v2

    long-to-int v0, v0

    const v1, 0x5f5e100

    mul-int/2addr v1, v0

    sub-int/2addr p1, v1

    if-lez p2, :cond_36

    const/4 v1, 0x7

    if-gt p2, v1, :cond_36

    .line 443
    invoke-direct {p0, v0, p1, p2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toChars1(III)I

    move-result p0

    return p0

    :cond_36
    const/4 v1, -0x3

    if-ge v1, p2, :cond_40

    if-gtz p2, :cond_40

    .line 446
    invoke-direct {p0, v0, p1, p2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toChars2(III)I

    move-result p0

    return p0

    .line 448
    :cond_40
    invoke-direct {p0, v0, p1, p2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toChars3(III)I

    move-result p0

    return p0
.end method

.method private toChars1(III)I
    .registers 6

    .line 457
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    .line 458
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->y(I)I

    move-result p1

    const/4 p2, 0x1

    :goto_8
    const v0, 0xfffffff

    if-ge p2, p3, :cond_18

    mul-int/lit8 p1, p1, 0xa

    ushr-int/lit8 v1, p1, 0x1c

    .line 463
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    and-int/2addr p1, v0

    add-int/lit8 p2, p2, 0x1

    goto :goto_8

    :cond_18
    const/16 p3, 0x2e

    .line 466
    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->append(I)V

    :goto_1d
    const/16 p3, 0x8

    if-gt p2, p3, :cond_2c

    mul-int/lit8 p1, p1, 0xa

    ushr-int/lit8 p3, p1, 0x1c

    .line 469
    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    and-int/2addr p1, v0

    add-int/lit8 p2, p2, 0x1

    goto :goto_1d

    .line 472
    :cond_2c
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->removeTrailingZeroes()V

    const/4 p0, 0x0

    return p0
.end method

.method private toChars2(III)I
    .registers 6

    const/4 v0, 0x0

    .line 478
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    const/16 v1, 0x2e

    .line 479
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->append(I)V

    :goto_9
    if-gez p3, :cond_11

    .line 481
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_9

    .line 483
    :cond_11
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    .line 484
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->append8Digits(I)V

    .line 485
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->removeTrailingZeroes()V

    return v0
.end method

.method private toChars3(III)I
    .registers 4

    .line 491
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->appendDigit(I)V

    const/16 p1, 0x2e

    .line 492
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->append(I)V

    .line 493
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->append8Digits(I)V

    .line 494
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->removeTrailingZeroes()V

    add-int/lit8 p3, p3, -0x1

    .line 495
    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->exponent(I)V

    const/4 p0, 0x0

    return p0
.end method

.method private toDecimal(F)I
    .registers 7

    .line 271
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    const v0, 0x7fffff

    and-int/2addr v0, p1

    ushr-int/lit8 v1, p1, 0x17

    const/16 v2, 0xff

    and-int/2addr v1, v2

    if-ge v1, v2, :cond_59

    const/4 v2, -0x1

    .line 275
    iput v2, p0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->index:I

    if-gez p1, :cond_19

    const/16 v3, 0x2d

    .line 277
    invoke-direct {p0, v3}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->append(I)V

    :cond_19
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_40

    rsub-int p1, v1, 0x96

    const/high16 v1, 0x800000

    or-int/2addr v0, v1

    if-lez p1, :cond_26

    move v1, v3

    goto :goto_27

    :cond_26
    move v1, v4

    :goto_27
    const/16 v2, 0x18

    if-lt p1, v2, :cond_2c

    move v3, v4

    :cond_2c
    and-int/2addr v1, v3

    if-eqz v1, :cond_3a

    shr-int v1, v0, p1

    shl-int v2, v1, p1

    if-ne v2, v0, :cond_3a

    .line 287
    invoke-direct {p0, v1, v4}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toChars(II)I

    move-result p0

    return p0

    :cond_3a
    neg-int p1, p1

    .line 290
    invoke-direct {p0, p1, v0, v4}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toDecimal(III)I

    move-result p0

    return p0

    :cond_40
    if-eqz v0, :cond_54

    const/16 p1, 0x8

    const/16 v1, -0x95

    if-ge v0, p1, :cond_4f

    mul-int/lit8 v0, v0, 0xa

    .line 295
    invoke-direct {p0, v1, v0, v2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toDecimal(III)I

    move-result p0

    return p0

    .line 296
    :cond_4f
    invoke-direct {p0, v1, v0, v4}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toDecimal(III)I

    move-result p0

    return p0

    :cond_54
    if-nez p1, :cond_57

    return v3

    :cond_57
    const/4 p0, 0x2

    return p0

    :cond_59
    if-eqz v0, :cond_5d

    const/4 p0, 0x5

    return p0

    :cond_5d
    if-lez p1, :cond_61

    const/4 p0, 0x3

    return p0

    :cond_61
    const/4 p0, 0x4

    return p0
.end method

.method private toDecimal(III)I
    .registers 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x1

    shl-int/lit8 v4, v2, 0x2

    int-to-long v4, v4

    const/high16 v6, 0x800000

    if-eq v2, v6, :cond_11

    const/4 v2, 0x1

    goto :goto_12

    :cond_11
    const/4 v2, 0x0

    :goto_12
    const/16 v6, -0x95

    if-ne v1, v6, :cond_18

    const/4 v6, 0x1

    goto :goto_19

    :cond_18
    const/4 v6, 0x0

    :goto_19
    or-int/2addr v2, v6

    const-wide/16 v9, 0x2

    const-wide/16 v11, 0x1

    if-eqz v2, :cond_27

    sub-long v13, v4, v9

    .line 338
    invoke-static/range {p1 .. p1}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->flog10pow2(I)I

    move-result v2

    goto :goto_2d

    :cond_27
    sub-long v13, v4, v11

    .line 342
    invoke-static/range {p1 .. p1}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->flog10threeQuartersPow2(I)I

    move-result v2

    :goto_2d
    neg-int v6, v2

    .line 344
    invoke-static {v6}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->flog2pow10(I)I

    move-result v6

    add-int/2addr v1, v6

    add-int/lit8 v1, v1, 0x21

    .line 347
    invoke-static {v2}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->g1(I)J

    move-result-wide v15

    add-long/2addr v11, v15

    shl-long v7, v4, v1

    .line 349
    invoke-static {v11, v12, v7, v8}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->rop(JJ)I

    move-result v7

    shl-long/2addr v13, v1

    .line 350
    invoke-static {v11, v12, v13, v14}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->rop(JJ)I

    move-result v8

    add-long/2addr v4, v9

    shl-long/2addr v4, v1

    .line 351
    invoke-static {v11, v12, v4, v5}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->rop(JJ)I

    move-result v1

    shr-int/lit8 v4, v7, 0x2

    const/16 v5, 0x64

    if-lt v4, v5, :cond_7a

    int-to-long v9, v4

    const-wide/32 v11, 0x66666667

    mul-long/2addr v9, v11

    const/16 v5, 0x22

    ushr-long/2addr v9, v5

    long-to-int v5, v9

    mul-int/lit8 v5, v5, 0xa

    add-int/lit8 v9, v5, 0xa

    add-int v10, v8, v3

    shl-int/lit8 v11, v5, 0x2

    if-gt v10, v11, :cond_66

    const/4 v10, 0x1

    goto :goto_67

    :cond_66
    const/4 v10, 0x0

    :goto_67
    shl-int/lit8 v11, v9, 0x2

    add-int/2addr v11, v3

    if-gt v11, v1, :cond_6e

    const/4 v11, 0x1

    goto :goto_6f

    :cond_6e
    const/4 v11, 0x0

    :goto_6f
    if-eq v10, v11, :cond_7a

    if-eqz v10, :cond_74

    goto :goto_75

    :cond_74
    move v5, v9

    .line 370
    :goto_75
    invoke-direct {v0, v5, v2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toChars(II)I

    move-result v0

    return v0

    :cond_7a
    add-int/lit8 v5, v4, 0x1

    add-int/2addr v8, v3

    shl-int/lit8 v9, v4, 0x2

    if-gt v8, v9, :cond_83

    const/4 v8, 0x1

    goto :goto_84

    :cond_83
    const/4 v8, 0x0

    :goto_84
    shl-int/lit8 v9, v5, 0x2

    add-int/2addr v9, v3

    if-gt v9, v1, :cond_8b

    const/4 v15, 0x1

    goto :goto_8c

    :cond_8b
    const/4 v15, 0x0

    :goto_8c
    if-eq v8, v15, :cond_98

    if-nez v8, :cond_91

    move v4, v5

    :cond_91
    add-int v2, v2, p3

    .line 385
    invoke-direct {v0, v4, v2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toChars(II)I

    move-result v0

    return v0

    :cond_98
    add-int v1, v4, v5

    const/4 v3, 0x1

    shl-int/2addr v1, v3

    sub-int/2addr v7, v1

    if-ltz v7, :cond_a7

    if-nez v7, :cond_a6

    and-int/lit8 v1, v4, 0x1

    if-nez v1, :cond_a6

    goto :goto_a7

    :cond_a6
    move v4, v5

    :cond_a7
    :goto_a7
    add-int v2, v2, p3

    .line 392
    invoke-direct {v0, v4, v2}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toChars(II)I

    move-result v0

    return v0
.end method

.method private toDecimalString(F)Ljava/lang/String;
    .registers 2

    .line 243
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toDecimal(F)I

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

    .line 249
    const-string p0, "NaN"

    return-object p0

    .line 248
    :cond_15
    const-string p0, "-Infinity"

    return-object p0

    .line 247
    :cond_18
    const-string p0, "Infinity"

    return-object p0

    .line 246
    :cond_1b
    const-string p0, "-0.0"

    return-object p0

    .line 245
    :cond_1e
    const-string p0, "0.0"

    return-object p0

    .line 244
    :cond_21
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->charsToString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(F)Ljava/lang/String;
    .registers 2

    .line 239
    new-instance v0, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;-><init>()V

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toDecimalString(F)Ljava/lang/String;

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

    .line 531
    invoke-static {p0, p1, v0, v1}, Lcom/fasterxml/jackson/core/io/schubfach/MathUtils;->multiplyHigh(JJ)J

    move-result-wide p0

    const/16 v0, 0x14

    ushr-long/2addr p0, v0

    long-to-int p0, p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method
