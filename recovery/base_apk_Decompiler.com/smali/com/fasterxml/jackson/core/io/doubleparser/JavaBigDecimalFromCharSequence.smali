###### Class com.fasterxml.jackson.core.io.doubleparser.JavaBigDecimalFromCharSequence (com.fasterxml.jackson.core.io.doubleparser.JavaBigDecimalFromCharSequence)
.class final Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;
.super Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 58
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;-><init>()V

    return-void
.end method

.method private valueOfBigDecimalString(Ljava/lang/CharSequence;IIIIZI)Ljava/math/BigDecimal;
    .registers 11

    sub-int p0, p5, p3

    add-int/lit8 p0, p0, -0x1

    sub-int v0, p3, p2

    const/16 v1, 0x190

    const/4 v2, 0x0

    if-lez v0, :cond_1e

    if-le v0, v1, :cond_19

    .line 339
    invoke-static {}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->createPowersOfTenFloor16Map()Ljava/util/NavigableMap;

    move-result-object v0

    .line 340
    invoke-static {v0, p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->fillPowersOfNFloor16Recursive(Ljava/util/NavigableMap;II)V

    .line 341
    invoke-static {p1, p2, p3, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/ParseDigitsTaskCharSequence;->parseDigitsRecursive(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    move-result-object p2

    goto :goto_21

    .line 343
    :cond_19
    invoke-static {p1, p2, p3, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/ParseDigitsTaskCharSequence;->parseDigitsRecursive(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    move-result-object p2

    goto :goto_20

    .line 346
    :cond_1e
    sget-object p2, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    :goto_20
    move-object v0, v2

    :goto_21
    if-lez p0, :cond_4d

    sub-int p3, p5, p4

    if-le p3, v1, :cond_35

    if-nez v0, :cond_2d

    .line 355
    invoke-static {}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->createPowersOfTenFloor16Map()Ljava/util/NavigableMap;

    move-result-object v0

    .line 357
    :cond_2d
    invoke-static {v0, p4, p5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->fillPowersOfNFloor16Recursive(Ljava/util/NavigableMap;II)V

    .line 358
    invoke-static {p1, p4, p5, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/ParseDigitsTaskCharSequence;->parseDigitsRecursive(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    move-result-object p1

    goto :goto_39

    .line 360
    :cond_35
    invoke-static {p1, p4, p5, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/ParseDigitsTaskCharSequence;->parseDigitsRecursive(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    move-result-object p1

    .line 362
    :goto_39
    invoke-virtual {p2}, Ljava/math/BigInteger;->signum()I

    move-result p3

    if-nez p3, :cond_41

    move-object p2, p1

    goto :goto_4d

    .line 365
    :cond_41
    invoke-static {v0, p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->computePowerOfTen(Ljava/util/NavigableMap;I)Ljava/math/BigInteger;

    move-result-object p0

    .line 366
    invoke-static {p2, p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->multiply(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p2

    :cond_4d
    :goto_4d
    if-eqz p6, :cond_53

    .line 374
    invoke-virtual {p2}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object p2

    :cond_53
    new-instance p0, Ljava/math/BigDecimal;

    neg-int p1, p7

    invoke-direct {p0, p2, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    return-object p0
.end method


# virtual methods
.method public final parseBigDecimalString(Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;
    .registers 33

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    .line 75
    const-string v9, "value exceeds limits"

    const/16 v3, 0x20

    if-lt v2, v3, :cond_14

    .line 76
    :try_start_c
    invoke-virtual/range {p0 .. p3}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->parseBigDecimalStringWithManyDigits(Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0

    :catch_11
    move-exception v0

    goto/16 :goto_146

    :cond_14
    add-int/2addr v2, v1

    .line 85
    invoke-static {v0, v1, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v4
    :try_end_19
    .catch Ljava/lang/ArithmeticException; {:try_start_c .. :try_end_19} :catch_11

    const/16 v5, 0x2d

    const/4 v7, 0x1

    if-ne v4, v5, :cond_20

    move v8, v7

    goto :goto_21

    :cond_20
    const/4 v8, 0x0

    .line 92
    :goto_21
    const-string v10, "illegal syntax"

    const/16 v11, 0x2b

    if-nez v8, :cond_30

    if-ne v4, v11, :cond_2a

    goto :goto_30

    :cond_2a
    :goto_2a
    move/from16 v28, v4

    move v4, v1

    move/from16 v1, v28

    goto :goto_39

    :cond_30
    :goto_30
    add-int/lit8 v1, v1, 0x1

    .line 93
    :try_start_32
    invoke-static {v0, v1, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v4

    if-eqz v4, :cond_140

    goto :goto_2a

    :goto_39
    const/4 v14, -0x1

    move v15, v4

    const-wide/16 v12, 0x0

    const/16 v16, 0x0

    :goto_3f
    const-wide/16 v17, 0x30

    const-wide/16 v19, 0xa

    if-ge v15, v2, :cond_8b

    .line 102
    invoke-interface {v0, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 103
    invoke-static {v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v21

    if-eqz v21, :cond_58

    mul-long v12, v12, v19

    int-to-long v5, v1

    add-long/2addr v12, v5

    sub-long v12, v12, v17

    move/from16 v23, v4

    goto :goto_83

    :cond_58
    const/16 v5, 0x2e

    if-ne v1, v5, :cond_8b

    if-ltz v14, :cond_60

    move v5, v7

    goto :goto_61

    :cond_60
    const/4 v5, 0x0

    :goto_61
    or-int v16, v16, v5

    move v5, v15

    :goto_64
    add-int/lit8 v6, v2, -0x4

    if-ge v5, v6, :cond_7f

    add-int/lit8 v6, v5, 0x1

    .line 110
    invoke-static {v0, v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseFourDigits(Ljava/lang/CharSequence;I)I

    move-result v6

    if-ltz v6, :cond_7f

    const-wide/16 v17, 0x2710

    mul-long v12, v12, v17

    move/from16 v23, v4

    int-to-long v3, v6

    add-long/2addr v12, v3

    add-int/lit8 v5, v5, 0x4

    move/from16 v4, v23

    const/16 v3, 0x20

    goto :goto_64

    :cond_7f
    move/from16 v23, v4

    move v14, v15

    move v15, v5

    :goto_83
    add-int/2addr v15, v7

    move/from16 v4, v23

    const/16 v3, 0x20

    const/16 v5, 0x2d

    goto :goto_3f

    :cond_8b
    move/from16 v23, v4

    sub-int v3, v15, v23

    if-gez v14, :cond_95

    move v4, v15

    const-wide/16 v5, 0x0

    goto :goto_9c

    :cond_95
    sub-int/2addr v3, v7

    sub-int v4, v14, v15

    add-int/2addr v4, v7

    int-to-long v4, v4

    move-wide v5, v4

    move v4, v14

    :goto_9c
    const/16 v14, 0x20

    or-int/2addr v1, v14

    const/16 v14, 0x65

    const-wide/32 v24, 0x7fffffff

    if-ne v1, v14, :cond_f5

    add-int/lit8 v1, v15, 0x1

    .line 139
    invoke-static {v0, v1, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v14

    const/16 v7, 0x2d

    if-ne v14, v7, :cond_b3

    const/16 v22, 0x1

    goto :goto_b5

    :cond_b3
    const/16 v22, 0x0

    :goto_b5
    if-nez v22, :cond_b9

    if-ne v14, v11, :cond_bf

    :cond_b9
    add-int/lit8 v1, v15, 0x2

    .line 142
    invoke-static {v0, v1, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v14

    .line 144
    :cond_bf
    invoke-static {v14}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v7

    const/4 v11, 0x1

    xor-int/2addr v7, v11

    or-int v16, v16, v7

    const-wide/16 v26, 0x0

    :goto_c9
    cmp-long v7, v26, v24

    if-gez v7, :cond_da

    mul-long v26, v26, v19

    move-wide/from16 p2, v12

    int-to-long v11, v14

    add-long v26, v26, v11

    sub-long v26, v26, v17

    move-wide/from16 v11, v26

    const/4 v7, 0x1

    goto :goto_df

    :cond_da
    move-wide/from16 p2, v12

    move v7, v11

    move-wide/from16 v11, v26

    :goto_df
    add-int/2addr v1, v7

    .line 150
    invoke-static {v0, v1, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v14

    .line 151
    invoke-static {v14}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v13

    if-nez v13, :cond_ef

    if-eqz v22, :cond_ed

    neg-long v11, v11

    :cond_ed
    add-long/2addr v5, v11

    goto :goto_f9

    :cond_ef
    move-wide/from16 v26, v11

    move-wide/from16 v12, p2

    move v11, v7

    goto :goto_c9

    :cond_f5
    move-wide/from16 p2, v12

    move v1, v15

    move v15, v2

    :goto_f9
    if-nez v16, :cond_13a

    if-lt v1, v2, :cond_13a

    if-eqz v3, :cond_13a

    const v1, 0x4d0e4c1d    # 1.4920955E8f

    if-gt v3, v1, :cond_13a

    const-wide/32 v1, -0x80000000

    cmp-long v1, v5, v1

    if-lez v1, :cond_134

    cmp-long v1, v5, v24

    if-gtz v1, :cond_134

    const/16 v1, 0x12

    if-gt v3, v1, :cond_123

    .line 170
    new-instance v0, Ljava/math/BigDecimal;

    move-wide/from16 v12, p2

    if-eqz v8, :cond_11a

    neg-long v12, v12

    :cond_11a
    invoke-direct {v0, v12, v13}, Ljava/math/BigDecimal;-><init>(J)V

    long-to-int v1, v5

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->scaleByPowerOfTen(I)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0

    :cond_123
    long-to-int v10, v5

    add-int/lit8 v5, v4, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, v23

    move v6, v15

    move v7, v8

    move v8, v10

    .line 172
    invoke-direct/range {v1 .. v8}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->valueOfBigDecimalString(Ljava/lang/CharSequence;IIIIZI)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0

    .line 166
    :cond_134
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v9}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 162
    :cond_13a
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v10}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_140
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v10}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_146
    .catch Ljava/lang/ArithmeticException; {:try_start_32 .. :try_end_146} :catch_11

    .line 174
    :goto_146
    new-instance v1, Ljava/lang/NumberFormatException;

    invoke-direct {v1, v9}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 176
    throw v1
.end method

.method final parseBigDecimalStringWithManyDigits(Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;
    .registers 27

    move-object/from16 v1, p1

    move/from16 v0, p2

    move/from16 v2, p3

    const v3, 0x4d0e4c2b    # 1.4920978E8f

    .line 185
    const-string v4, "illegal syntax"

    if-gt v2, v3, :cond_150

    add-int/2addr v2, v0

    .line 196
    invoke-static {v1, v0, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v3

    const/16 v5, 0x2d

    const/4 v7, 0x1

    if-ne v3, v5, :cond_19

    move v8, v7

    goto :goto_1a

    :cond_19
    const/4 v8, 0x0

    :goto_1a
    const/16 v9, 0x2b

    if-nez v8, :cond_20

    if-ne v3, v9, :cond_28

    :cond_20
    add-int/lit8 v0, v0, 0x1

    .line 203
    invoke-static {v1, v0, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v3

    if-eqz v3, :cond_14a

    :cond_28
    move v10, v0

    :goto_29
    add-int/lit8 v11, v2, -0x8

    if-ge v10, v11, :cond_36

    .line 213
    invoke-static {v1, v10}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isEightZeroes(Ljava/lang/CharSequence;I)Z

    move-result v12

    if-eqz v12, :cond_36

    add-int/lit8 v10, v10, 0x8

    goto :goto_29

    :cond_36
    :goto_36
    const/16 v12, 0x30

    if-ge v10, v2, :cond_43

    .line 216
    invoke-interface {v1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-ne v13, v12, :cond_43

    add-int/lit8 v10, v10, 0x1

    goto :goto_36

    :cond_43
    move v13, v10

    :goto_44
    if-ge v13, v11, :cond_4f

    .line 221
    invoke-static {v1, v13}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isEightDigits(Ljava/lang/CharSequence;I)Z

    move-result v14

    if-eqz v14, :cond_4f

    add-int/lit8 v13, v13, 0x8

    goto :goto_44

    :cond_4f
    :goto_4f
    if-ge v13, v2, :cond_5e

    .line 224
    invoke-interface {v1, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v14

    if-eqz v14, :cond_5e

    add-int/lit8 v13, v13, 0x1

    goto :goto_4f

    :cond_5e
    const/16 v14, 0x2e

    if-ne v3, v14, :cond_95

    add-int/lit8 v14, v13, 0x1

    :goto_64
    if-ge v14, v11, :cond_6f

    .line 230
    invoke-static {v1, v14}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isEightZeroes(Ljava/lang/CharSequence;I)Z

    move-result v15

    if-eqz v15, :cond_6f

    add-int/lit8 v14, v14, 0x8

    goto :goto_64

    :cond_6f
    :goto_6f
    if-ge v14, v2, :cond_7a

    .line 233
    invoke-interface {v1, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    if-ne v15, v12, :cond_7a

    add-int/lit8 v14, v14, 0x1

    goto :goto_6f

    :cond_7a
    move v12, v14

    :goto_7b
    if-ge v12, v11, :cond_86

    .line 238
    invoke-static {v1, v12}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isEightDigits(Ljava/lang/CharSequence;I)Z

    move-result v15

    if-eqz v15, :cond_86

    add-int/lit8 v12, v12, 0x8

    goto :goto_7b

    :cond_86
    :goto_86
    if-ge v12, v2, :cond_98

    .line 241
    invoke-interface {v1, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v11

    if-eqz v11, :cond_98

    add-int/lit8 v12, v12, 0x1

    goto :goto_86

    :cond_95
    const/4 v14, -0x1

    move v12, v13

    move v13, v14

    :cond_98
    const-wide/16 v15, 0x0

    if-gez v13, :cond_a4

    sub-int v11, v12, v10

    move/from16 v18, v8

    move v13, v12

    move v14, v13

    move-wide v7, v15

    goto :goto_b3

    :cond_a4
    if-ne v10, v13, :cond_a9

    sub-int v11, v12, v14

    goto :goto_ac

    :cond_a9
    sub-int v11, v12, v10

    sub-int/2addr v11, v7

    :goto_ac
    sub-int v17, v13, v12

    add-int/lit8 v6, v17, 0x1

    move/from16 v18, v8

    int-to-long v7, v6

    :goto_b3
    or-int/lit8 v3, v3, 0x20

    const/16 v6, 0x65

    const-wide/32 v19, 0x7fffffff

    if-ne v3, v6, :cond_108

    add-int/lit8 v3, v12, 0x1

    .line 266
    invoke-static {v1, v3, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v6

    if-ne v6, v5, :cond_c6

    const/4 v5, 0x1

    goto :goto_c7

    :cond_c6
    const/4 v5, 0x0

    :goto_c7
    if-nez v5, :cond_cb

    if-ne v6, v9, :cond_d1

    :cond_cb
    add-int/lit8 v3, v12, 0x2

    .line 269
    invoke-static {v1, v3, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v6

    .line 271
    :cond_d1
    invoke-static {v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v9

    :goto_d5
    cmp-long v21, v15, v19

    if-gez v21, :cond_e7

    const-wide/16 v21, 0xa

    mul-long v15, v15, v21

    move/from16 p2, v12

    move/from16 v21, v13

    int-to-long v12, v6

    add-long/2addr v15, v12

    const-wide/16 v12, 0x30

    sub-long/2addr v15, v12

    goto :goto_eb

    :cond_e7
    move/from16 p2, v12

    move/from16 v21, v13

    :goto_eb
    move-wide v12, v15

    const/4 v6, 0x1

    add-int/2addr v3, v6

    .line 277
    invoke-static {v1, v3, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v15

    .line 278
    invoke-static {v15}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v16

    if-nez v16, :cond_101

    if-eqz v5, :cond_fb

    neg-long v12, v12

    :cond_fb
    add-long/2addr v7, v12

    xor-int/2addr v6, v9

    move/from16 v5, p2

    move v12, v3

    goto :goto_10e

    :cond_101
    move v6, v15

    move-wide v15, v12

    move/from16 v13, v21

    move/from16 v12, p2

    goto :goto_d5

    :cond_108
    move/from16 p2, v12

    move/from16 v21, v13

    move v5, v2

    const/4 v6, 0x0

    :goto_10e
    if-nez v6, :cond_144

    if-lt v12, v2, :cond_144

    sub-int v0, v5, v0

    if-eqz v0, :cond_13e

    const-wide/32 v2, -0x80000000

    cmp-long v0, v7, v2

    if-ltz v0, :cond_136

    cmp-long v0, v7, v19

    if-gtz v0, :cond_136

    const v0, 0x4d0e4c1d    # 1.4920955E8f

    if-gt v11, v0, :cond_136

    long-to-int v7, v7

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v10

    move/from16 v3, v21

    move v4, v14

    move/from16 v6, v18

    .line 297
    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->valueOfBigDecimalString(Ljava/lang/CharSequence;IIIIZI)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0

    .line 295
    :cond_136
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "value exceeds limits"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 290
    :cond_13e
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 287
    :cond_144
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :cond_14a
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 186
    :cond_150
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
