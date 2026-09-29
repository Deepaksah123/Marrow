###### Class com.fasterxml.jackson.core.io.doubleparser.ParseDigitsTaskCharSequence (com.fasterxml.jackson.core.io.doubleparser.ParseDigitsTaskCharSequence)
.class Lcom/fasterxml/jackson/core/io/doubleparser/ParseDigitsTaskCharSequence;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static parseDigitsIterative(Ljava/lang/CharSequence;II)Ljava/math/BigInteger;
    .registers 9

    sub-int v0, p2, p1

    .line 46
    new-instance v1, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;

    int-to-long v2, v0

    invoke-static {v2, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->estimateNumBits(J)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;-><init>(J)V

    and-int/lit8 v0, v0, 0x7

    add-int/2addr v0, p1

    .line 48
    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseUpTo7Digits(Ljava/lang/CharSequence;II)I

    move-result p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ltz p1, :cond_19

    move v4, v2

    goto :goto_1a

    :cond_19
    move v4, v3

    .line 50
    :goto_1a
    invoke-virtual {v1, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->add(I)V

    :goto_1d
    if-ge v0, p2, :cond_32

    .line 52
    invoke-static {p0, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseEightDigits(Ljava/lang/CharSequence;I)I

    move-result p1

    if-ltz p1, :cond_27

    move v5, v2

    goto :goto_28

    :cond_27
    move v5, v3

    :goto_28
    and-int/2addr v4, v5

    const v5, 0x5f5e100

    .line 54
    invoke-virtual {v1, v5, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->fma(II)V

    add-int/lit8 v0, v0, 0x8

    goto :goto_1d

    :cond_32
    if-eqz v4, :cond_39

    .line 59
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 57
    :cond_39
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string p1, "illegal syntax"

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static parseDigitsRecursive(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/math/BigInteger;",
            ">;)",
            "Ljava/math/BigInteger;"
        }
    .end annotation

    sub-int v0, p2, p1

    const/16 v1, 0x190

    if-gt v0, v1, :cond_b

    .line 75
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/ParseDigitsTaskCharSequence;->parseDigitsIterative(Ljava/lang/CharSequence;II)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 79
    :cond_b
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->splitFloor16(II)I

    move-result v0

    .line 80
    invoke-static {p0, p1, v0, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/ParseDigitsTaskCharSequence;->parseDigitsRecursive(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    move-result-object p1

    .line 81
    invoke-static {p0, v0, p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/ParseDigitsTaskCharSequence;->parseDigitsRecursive(Ljava/lang/CharSequence;IILjava/util/Map;)Ljava/math/BigInteger;

    move-result-object p0

    sub-int/2addr p2, v0

    .line 84
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/math/BigInteger;

    invoke-static {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->multiply(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method
