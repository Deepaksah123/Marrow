###### Class com.fasterxml.jackson.core.io.doubleparser.JavaBigIntegerFromCharSequence (com.fasterxml.jackson.core.io.doubleparser.JavaBigIntegerFromCharSequence)
.class Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;
.super Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .registers 1

    .line 12
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;-><init>()V

    return-void
.end method

.method private parseDecDigits(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;
    .registers 12

    sub-int v0, p3, p2

    const/16 v1, 0x12

    if-le v0, v1, :cond_b

    .line 68
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->parseManyDecDigits(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_b
    and-int/lit8 p0, v0, 0x7

    add-int/2addr p0, p2

    .line 71
    invoke-static {p1, p2, p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseUpTo7Digits(Ljava/lang/CharSequence;II)I

    move-result p2

    int-to-long v0, p2

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ltz p2, :cond_1d

    move p2, v2

    goto :goto_1e

    :cond_1d
    move p2, v3

    :goto_1e
    if-ge p0, p3, :cond_33

    .line 74
    invoke-static {p1, p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseEightDigits(Ljava/lang/CharSequence;I)I

    move-result v4

    if-ltz v4, :cond_28

    move v5, v2

    goto :goto_29

    :cond_28
    move v5, v3

    :goto_29
    and-int/2addr p2, v5

    const-wide/32 v5, 0x5f5e100

    mul-long/2addr v0, v5

    int-to-long v4, v4

    add-long/2addr v0, v4

    add-int/lit8 p0, p0, 0x8

    goto :goto_1e

    :cond_33
    if-eqz p2, :cond_3d

    if-eqz p4, :cond_38

    neg-long v0, v0

    .line 81
    :cond_38
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 79
    :cond_3d
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string p1, "illegal syntax"

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private parseHexDigits(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;
    .registers 14

    .line 85
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->skipZeroes(Ljava/lang/CharSequence;II)I

    move-result p0

    sub-int p2, p3, p0

    if-gtz p2, :cond_b

    .line 88
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    return-object p0

    :cond_b
    const/high16 v0, 0x20000000

    if-gt p2, v0, :cond_8c

    add-int/lit8 v0, p2, 0x1

    const/4 v1, 0x1

    shr-int/2addr v0, v1

    add-int/2addr v0, v1

    .line 93
    new-array v0, v0, [B

    and-int/2addr p2, v1

    const/4 v2, 0x0

    if-eqz p2, :cond_2e

    .line 97
    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    .line 98
    invoke-static {p2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->lookupHex(C)I

    move-result p2

    int-to-byte v3, p2

    .line 99
    aput-byte v3, v0, v1

    if-gez p2, :cond_29

    move p2, v1

    goto :goto_2a

    :cond_29
    move p2, v2

    :goto_2a
    add-int/lit8 p0, p0, 0x1

    const/4 v3, 0x2

    goto :goto_30

    :cond_2e
    move v3, v1

    move p2, v2

    :goto_30
    move v4, p0

    :goto_31
    sub-int v5, p3, p0

    and-int/lit8 v5, v5, 0x7

    add-int/2addr v5, p0

    if-ge v4, v5, :cond_5d

    .line 104
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    add-int/lit8 v6, v4, 0x1

    .line 105
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    .line 106
    invoke-static {v5}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->lookupHex(C)I

    move-result v5

    .line 107
    invoke-static {v6}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->lookupHex(C)I

    move-result v6

    shl-int/lit8 v7, v5, 0x4

    or-int/2addr v7, v6

    int-to-byte v7, v7

    .line 108
    aput-byte v7, v0, v3

    if-ltz v6, :cond_56

    if-ltz v5, :cond_56

    move v5, v2

    goto :goto_57

    :cond_56
    move v5, v1

    :goto_57
    or-int/2addr p2, v5

    add-int/lit8 v4, v4, 0x2

    add-int/lit8 v3, v3, 0x1

    goto :goto_31

    :cond_5d
    :goto_5d
    if-ge v4, p3, :cond_76

    .line 112
    invoke-static {p1, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseEightHexDigits(Ljava/lang/CharSequence;I)J

    move-result-wide v5

    long-to-int p0, v5

    .line 113
    invoke-static {v0, v3, p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->writeIntBE([BII)V

    const-wide/16 v7, 0x0

    cmp-long p0, v5, v7

    if-gez p0, :cond_6f

    move p0, v1

    goto :goto_70

    :cond_6f
    move p0, v2

    :goto_70
    or-int/2addr p2, p0

    add-int/lit8 v4, v4, 0x8

    add-int/lit8 v3, v3, 0x4

    goto :goto_5d

    :cond_76
    if-nez p2, :cond_84

    .line 119
    new-instance p0, Ljava/math/BigInteger;

    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>([B)V

    if-eqz p4, :cond_83

    .line 120
    invoke-virtual {p0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object p0

    :cond_83
    return-object p0

    .line 117
    :cond_84
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string p1, "illegal syntax"

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 91
    :cond_8c
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string p1, "value exceeds limits"

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private parseManyDecDigits(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;
    .registers 6

    .line 124
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->skipZeroes(Ljava/lang/CharSequence;II)I

    move-result p0

    sub-int p2, p3, p0

    const v0, 0x268826a1

    if-gt p2, v0, :cond_1a

    .line 129
    invoke-static {p0, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->fillPowersOf10Floor16(II)Ljava/util/NavigableMap;

    move-result-object p2

    .line 130
    invoke-static {p1, p0, p3, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/ParseDigitsTaskCharSequence;->parseDigitsRecursive(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    move-result-object p0

    if-eqz p4, :cond_19

    .line 131
    invoke-virtual {p0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object p0

    :cond_19
    return-object p0

    .line 127
    :cond_1a
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string p1, "value exceeds limits"

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private skipZeroes(Ljava/lang/CharSequence;II)I
    .registers 5

    :goto_0
    if-ge p2, p3, :cond_d

    .line 135
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 v0, 0x30

    if-ne p0, v0, :cond_d

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_d
    return p2
.end method


# virtual methods
.method public parseBigIntegerLiteral(Ljava/lang/CharSequence;III)Ljava/math/BigInteger;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    add-int v0, p2, p3

    if-ltz p2, :cond_54

    if-lt v0, p2, :cond_54

    .line 35
    :try_start_6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-gt v0, v1, :cond_54

    const v1, 0x4d0e4c1e    # 1.4920957E8f

    if-gt p3, v1, :cond_54

    .line 41
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_1b

    const/4 v2, 0x1

    goto :goto_1c

    :cond_1b
    const/4 v2, 0x0

    :goto_1c
    if-nez v2, :cond_24

    const/16 v3, 0x2b

    if-eq v1, v3, :cond_24

    move v1, p2

    goto :goto_2c

    :cond_24
    add-int/lit8 v1, p2, 0x1

    .line 44
    invoke-static {p1, v1, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v3

    if-eqz v3, :cond_4c

    :goto_2c
    const/16 v3, 0xa

    if-eq p4, v3, :cond_47

    const/16 v3, 0x10

    if-eq p4, v3, :cond_42

    .line 56
    new-instance p0, Ljava/math/BigInteger;

    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p4}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    return-object p0

    .line 54
    :cond_42
    invoke-direct {p0, p1, v1, v0, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->parseHexDigits(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 52
    :cond_47
    invoke-direct {p0, p1, v1, v0, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->parseDecDigits(Ljava/lang/CharSequence;IIZ)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 46
    :cond_4c
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string p1, "illegal syntax"

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 36
    :cond_54
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "offset < 0 or length > str.length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_5c
    .catch Ljava/lang/ArithmeticException; {:try_start_6 .. :try_end_5c} :catch_5c

    :catch_5c
    move-exception p0

    .line 59
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string p2, "value exceeds limits"

    invoke-direct {p1, p2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 61
    throw p1
.end method
