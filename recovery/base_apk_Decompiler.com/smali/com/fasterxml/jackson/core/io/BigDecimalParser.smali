###### Class com.fasterxml.jackson.core.io.BigDecimalParser (com.fasterxml.jackson.core.io.BigDecimalParser)
.class public final Lcom/fasterxml/jackson/core/io/BigDecimalParser;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static adjustScale(IJ)I
    .registers 8

    int-to-long v0, p0

    sub-long/2addr v0, p1

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gtz v2, :cond_12

    const-wide/32 v2, -0x80000000

    cmp-long v2, v0, v2

    if-ltz v2, :cond_12

    long-to-int p0, v0

    return p0

    .line 188
    :cond_12
    new-instance v2, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Scale out of range: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " while adjusting scale "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " to exponent "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static parse(Ljava/lang/String;)Ljava/math/BigDecimal;
    .registers 1

    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->parse([C)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static parse([C)Ljava/math/BigDecimal;
    .registers 3

    const/4 v0, 0x0

    .line 62
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->parse([CII)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static parse([CII)Ljava/math/BigDecimal;
    .registers 6

    const/16 v0, 0x1f4

    if-ge p2, v0, :cond_a

    .line 37
    :try_start_4
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0, p1, p2}, Ljava/math/BigDecimal;-><init>([CII)V

    return-object v0

    .line 39
    :cond_a
    div-int/lit8 v0, p2, 0xa

    invoke-static {p0, p1, p2, v0}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->parseBigDecimal([CIII)Ljava/math/BigDecimal;

    move-result-object p0
    :try_end_10
    .catch Ljava/lang/ArithmeticException; {:try_start_4 .. :try_end_10} :catch_11
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_10} :catch_11

    return-object p0

    :catch_11
    move-exception v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1a

    .line 47
    const-string v0, "Not a valid number representation"

    :cond_1a
    const/16 v1, 0x3e8

    if-gt p2, v1, :cond_24

    .line 51
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p0, p1, p2}, Ljava/lang/String;-><init>([CII)V

    goto :goto_47

    .line 53
    :cond_24
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/lang/String;

    invoke-static {p0, p1, v1}, Ljava/util/Arrays;->copyOfRange([CII)[C

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "(truncated, full length is "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " chars)"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 56
    :goto_47
    new-instance p0, Ljava/lang/NumberFormatException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Value \""

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\" can not be represented as `java.math.BigDecimal`, reason: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static parseBigDecimal([CIII)Ljava/math/BigDecimal;
    .registers 20

    move-object/from16 v0, p0

    move/from16 v1, p3

    add-int v2, p1, p2

    const/4 v3, -0x1

    move/from16 v5, p1

    move v6, v5

    move v7, v3

    move v9, v7

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_10
    if-ge v5, v2, :cond_7d

    .line 98
    aget-char v14, v0, v5

    const/16 v15, 0x2b

    .line 99
    const-string v4, "Multiple signs in exponent"

    const-string v13, "Multiple signs in number"

    if-eq v14, v15, :cond_62

    const/16 v15, 0x45

    if-eq v14, v15, :cond_56

    const/16 v15, 0x65

    if-eq v14, v15, :cond_56

    const/16 v15, 0x2d

    if-eq v14, v15, :cond_3f

    const/16 v4, 0x2e

    if-eq v14, v4, :cond_33

    if-ltz v9, :cond_74

    if-ne v7, v3, :cond_74

    add-int/lit8 v8, v8, 0x1

    goto :goto_74

    :cond_33
    if-gez v9, :cond_37

    move v9, v5

    goto :goto_74

    .line 138
    :cond_37
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "Multiple decimal points"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    if-ltz v7, :cond_4a

    if-nez v11, :cond_44

    goto :goto_66

    .line 117
    :cond_44
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4a
    if-nez v10, :cond_50

    add-int/lit8 v4, v5, 0x1

    const/4 v12, 0x1

    goto :goto_72

    .line 122
    :cond_50
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v13}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_56
    if-gez v7, :cond_5a

    move v7, v5

    goto :goto_74

    .line 132
    :cond_5a
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "Multiple exponent markers"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_62
    if-ltz v7, :cond_6e

    if-nez v11, :cond_68

    :goto_66
    const/4 v11, 0x1

    goto :goto_74

    .line 103
    :cond_68
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6e
    if-nez v10, :cond_77

    add-int/lit8 v4, v5, 0x1

    :goto_72
    move v6, v4

    const/4 v10, 0x1

    :cond_74
    :goto_74
    add-int/lit8 v5, v5, 0x1

    goto :goto_10

    .line 108
    :cond_77
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0, v13}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7d
    if-ltz v7, :cond_94

    .line 153
    new-instance v3, Ljava/lang/String;

    add-int/lit8 v4, v7, 0x1

    sub-int/2addr v2, v7

    const/4 v5, 0x1

    sub-int/2addr v2, v5

    invoke-direct {v3, v0, v4, v2}, Ljava/lang/String;-><init>([CII)V

    .line 154
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    int-to-long v2, v4

    .line 155
    invoke-static {v8, v2, v3}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->adjustScale(IJ)I

    move-result v8

    move v2, v7

    goto :goto_96

    :cond_94
    const/4 v5, 0x1

    const/4 v4, 0x0

    :goto_96
    if-ltz v9, :cond_ab

    sub-int v3, v9, v6

    .line 164
    invoke-static {v0, v6, v3, v4, v1}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->toBigDecimalRec([CIIII)Ljava/math/BigDecimal;

    move-result-object v3

    sub-int/2addr v2, v9

    sub-int/2addr v2, v5

    add-int/2addr v9, v5

    sub-int/2addr v4, v2

    .line 167
    invoke-static {v0, v9, v2, v4, v1}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->toBigDecimalRec([CIIII)Ljava/math/BigDecimal;

    move-result-object v0

    .line 169
    invoke-virtual {v3, v0}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    goto :goto_b0

    :cond_ab
    sub-int/2addr v2, v6

    .line 171
    invoke-static {v0, v6, v2, v4, v1}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->toBigDecimalRec([CIIII)Ljava/math/BigDecimal;

    move-result-object v0

    :goto_b0
    if-eqz v8, :cond_b6

    .line 175
    invoke-virtual {v0, v8}, Ljava/math/BigDecimal;->setScale(I)Ljava/math/BigDecimal;

    move-result-object v0

    :cond_b6
    if-eqz v12, :cond_bc

    .line 179
    invoke-virtual {v0}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object v0

    :cond_bc
    return-object v0
.end method

.method public static parseWithFastParser(Ljava/lang/String;)Ljava/math/BigDecimal;
    .registers 5

    .line 67
    :try_start_0
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalParser;->parseBigDecimal(Ljava/lang/CharSequence;)Ljava/math/BigDecimal;

    move-result-object p0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_4} :catch_5

    return-object p0

    :catch_5
    move-exception v0

    .line 69
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x3e8

    if-le v1, v2, :cond_24

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    .line 70
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " [truncated]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 71
    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Value \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\" can not be represented as `java.math.BigDecimal`, reason: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static toBigDecimalRec([CIIII)Ljava/math/BigDecimal;
    .registers 7

    if-le p2, p4, :cond_16

    .line 198
    div-int/lit8 v0, p2, 0x2

    add-int v1, p3, p2

    sub-int/2addr v1, v0

    .line 199
    invoke-static {p0, p1, v0, v1, p4}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->toBigDecimalRec([CIIII)Ljava/math/BigDecimal;

    move-result-object v1

    add-int/2addr p1, v0

    sub-int/2addr p2, v0

    .line 200
    invoke-static {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->toBigDecimalRec([CIIII)Ljava/math/BigDecimal;

    move-result-object p0

    .line 202
    invoke-virtual {v1, p0}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0

    :cond_16
    if-nez p2, :cond_1b

    .line 206
    sget-object p0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    return-object p0

    .line 210
    :cond_1b
    new-instance p4, Ljava/math/BigDecimal;

    invoke-direct {p4, p0, p1, p2}, Ljava/math/BigDecimal;-><init>([CII)V

    .line 212
    invoke-virtual {p4, p3}, Ljava/math/BigDecimal;->scaleByPowerOfTen(I)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method
