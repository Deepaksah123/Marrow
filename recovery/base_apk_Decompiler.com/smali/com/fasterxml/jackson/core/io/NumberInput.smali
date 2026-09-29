###### Class com.fasterxml.jackson.core.io.NumberInput (com.fasterxml.jackson.core.io.NumberInput)
.class public final Lcom/fasterxml/jackson/core/io/NumberInput;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final MAX_LONG_STR:Ljava/lang/String; = "9223372036854775807"

.field static final MIN_LONG_STR_NO_SIGN:Ljava/lang/String; = "9223372036854775808"


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inLongRange(Ljava/lang/String;Z)Z
    .registers 8

    if-eqz p1, :cond_5

    .line 244
    sget-object p1, Lcom/fasterxml/jackson/core/io/NumberInput;->MIN_LONG_STR_NO_SIGN:Ljava/lang/String;

    goto :goto_7

    :cond_5
    sget-object p1, Lcom/fasterxml/jackson/core/io/NumberInput;->MAX_LONG_STR:Ljava/lang/String;

    .line 245
    :goto_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 246
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ge v1, v0, :cond_13

    return v2

    :cond_13
    const/4 v3, 0x0

    if-le v1, v0, :cond_17

    return v3

    :cond_17
    move v1, v3

    :goto_18
    if-ge v1, v0, :cond_2c

    .line 252
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    sub-int/2addr v4, v5

    if-eqz v4, :cond_29

    if-gez v4, :cond_28

    return v2

    :cond_28
    return v3

    :cond_29
    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    :cond_2c
    return v2
.end method

.method public static inLongRange([CIIZ)Z
    .registers 9

    if-eqz p3, :cond_5

    .line 217
    sget-object p3, Lcom/fasterxml/jackson/core/io/NumberInput;->MIN_LONG_STR_NO_SIGN:Ljava/lang/String;

    goto :goto_7

    :cond_5
    sget-object p3, Lcom/fasterxml/jackson/core/io/NumberInput;->MAX_LONG_STR:Ljava/lang/String;

    .line 218
    :goto_7
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge p2, v0, :cond_f

    return v1

    :cond_f
    const/4 v2, 0x0

    if-le p2, v0, :cond_13

    return v2

    :cond_13
    move p2, v2

    :goto_14
    if-ge p2, v0, :cond_28

    add-int v3, p1, p2

    .line 223
    aget-char v3, p0, v3

    invoke-virtual {p3, p2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    sub-int/2addr v3, v4

    if-eqz v3, :cond_25

    if-gez v3, :cond_24

    return v1

    :cond_24
    return v2

    :cond_25
    add-int/lit8 p2, p2, 0x1

    goto :goto_14

    :cond_28
    return v1
.end method

.method public static parseAsDouble(Ljava/lang/String;D)D
    .registers 4

    const/4 v0, 0x0

    .line 346
    invoke-static {p0, p1, p2, v0}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseAsDouble(Ljava/lang/String;DZ)D

    move-result-wide p0

    return-wide p0
.end method

.method public static parseAsDouble(Ljava/lang/String;DZ)D
    .registers 5

    if-eqz p0, :cond_12

    .line 359
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 360
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_d

    goto :goto_12

    .line 365
    :cond_d
    :try_start_d
    invoke-static {p0, p3}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseDouble(Ljava/lang/String;Z)D

    move-result-wide p0
    :try_end_11
    .catch Ljava/lang/NumberFormatException; {:try_start_d .. :try_end_11} :catch_12

    return-wide p0

    :catch_12
    :cond_12
    :goto_12
    return-wide p1
.end method

.method public static parseAsInt(Ljava/lang/String;I)I
    .registers 7

    if-eqz p0, :cond_42

    .line 265
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 266
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_d

    goto :goto_42

    :cond_d
    const/4 v1, 0x0

    .line 273
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2b

    const/4 v4, 0x1

    if-ne v2, v3, :cond_20

    .line 275
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 276
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_25

    :cond_20
    const/16 v3, 0x2d

    if-ne v2, v3, :cond_25

    move v1, v4

    :cond_25
    :goto_25
    if-ge v1, v0, :cond_3d

    .line 281
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x39

    if-gt v2, v3, :cond_36

    const/16 v3, 0x30

    if-lt v2, v3, :cond_36

    add-int/lit8 v1, v1, 0x1

    goto :goto_25

    .line 287
    :cond_36
    :try_start_36
    invoke-static {p0, v4}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseDouble(Ljava/lang/String;Z)D

    move-result-wide p0
    :try_end_3a
    .catch Ljava/lang/NumberFormatException; {:try_start_36 .. :try_end_3a} :catch_3c

    double-to-int p0, p0

    return p0

    :catch_3c
    return p1

    .line 294
    :cond_3d
    :try_start_3d
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_41
    .catch Ljava/lang/NumberFormatException; {:try_start_3d .. :try_end_41} :catch_42

    return p0

    :catch_42
    :cond_42
    :goto_42
    return p1
.end method

.method public static parseAsLong(Ljava/lang/String;J)J
    .registers 8

    if-eqz p0, :cond_42

    .line 304
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 305
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_d

    goto :goto_42

    :cond_d
    const/4 v1, 0x0

    .line 312
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2b

    const/4 v4, 0x1

    if-ne v2, v3, :cond_20

    .line 314
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 315
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_25

    :cond_20
    const/16 v3, 0x2d

    if-ne v2, v3, :cond_25

    move v1, v4

    :cond_25
    :goto_25
    if-ge v1, v0, :cond_3d

    .line 320
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x39

    if-gt v2, v3, :cond_36

    const/16 v3, 0x30

    if-lt v2, v3, :cond_36

    add-int/lit8 v1, v1, 0x1

    goto :goto_25

    .line 326
    :cond_36
    :try_start_36
    invoke-static {p0, v4}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseDouble(Ljava/lang/String;Z)D

    move-result-wide p0
    :try_end_3a
    .catch Ljava/lang/NumberFormatException; {:try_start_36 .. :try_end_3a} :catch_3c

    double-to-long p0, p0

    return-wide p0

    :catch_3c
    return-wide p1

    .line 333
    :cond_3d
    :try_start_3d
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_41
    .catch Ljava/lang/NumberFormatException; {:try_start_3d .. :try_end_41} :catch_42

    return-wide p0

    :catch_42
    :cond_42
    :goto_42
    return-wide p1
.end method

.method public static parseBigDecimal(Ljava/lang/String;Z)Ljava/math/BigDecimal;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 431
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->parseWithFastParser(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0

    .line 432
    :cond_7
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/BigDecimalParser;->parse(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static parseBigInteger(Ljava/lang/String;)Ljava/math/BigInteger;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 492
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static parseBigInteger(Ljava/lang/String;Z)Ljava/math/BigInteger;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 504
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/BigIntegerParser;->parseWithFastParser(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 506
    :cond_7
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseBigInteger(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static parseDouble(Ljava/lang/String;)D
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 377
    invoke-static {p0, v0}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseDouble(Ljava/lang/String;Z)D

    move-result-wide v0

    return-wide v0
.end method

.method public static parseDouble(Ljava/lang/String;Z)D
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 388
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleParser;->parseDouble(Ljava/lang/CharSequence;)D

    move-result-wide p0

    return-wide p0

    :cond_7
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0
.end method

.method public static parseFloat(Ljava/lang/String;)F
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 399
    invoke-static {p0, v0}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseFloat(Ljava/lang/String;Z)F

    move-result p0

    return p0
.end method

.method public static parseFloat(Ljava/lang/String;Z)F
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 410
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatParser;->parseFloat(Ljava/lang/CharSequence;)F

    move-result p0

    return p0

    :cond_7
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    return p0
.end method

.method public static parseInt(Ljava/lang/String;)I
    .registers 11

    const/4 v0, 0x0

    .line 97
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 98
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x2d

    const/4 v4, 0x1

    if-ne v1, v3, :cond_f

    move v0, v4

    :cond_f
    const/4 v3, 0x2

    const/16 v5, 0xa

    if-eqz v0, :cond_23

    if-eq v2, v4, :cond_1e

    if-gt v2, v5, :cond_1e

    .line 107
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move v4, v3

    goto :goto_2c

    .line 105
    :cond_1e
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_23
    const/16 v6, 0x9

    if-le v2, v6, :cond_2c

    .line 110
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_2c
    :goto_2c
    const/16 v6, 0x39

    if-gt v1, v6, :cond_7c

    const/16 v7, 0x30

    if-lt v1, v7, :cond_7c

    sub-int/2addr v1, v7

    if-ge v4, v2, :cond_77

    add-int/lit8 v8, v4, 0x1

    .line 118
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-gt v9, v6, :cond_72

    if-lt v9, v7, :cond_72

    mul-int/lit8 v1, v1, 0xa

    sub-int/2addr v9, v7

    add-int/2addr v1, v9

    if-ge v8, v2, :cond_77

    add-int/2addr v4, v3

    .line 124
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-gt v3, v6, :cond_6d

    if-lt v3, v7, :cond_6d

    mul-int/lit8 v1, v1, 0xa

    sub-int/2addr v3, v7

    add-int/2addr v1, v3

    if-ge v4, v2, :cond_77

    :goto_56
    add-int/lit8 v3, v4, 0x1

    .line 132
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-gt v4, v6, :cond_68

    if-lt v4, v7, :cond_68

    mul-int/2addr v1, v5

    add-int/lit8 v4, v4, -0x30

    add-int/2addr v1, v4

    if-ge v3, v2, :cond_77

    move v4, v3

    goto :goto_56

    .line 134
    :cond_68
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    .line 126
    :cond_6d
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    .line 120
    :cond_72
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_77
    if-eqz v0, :cond_7b

    neg-int p0, v1

    return p0

    :cond_7b
    return v1

    .line 114
    :cond_7c
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static parseInt([CII)I
    .registers 5

    if-lez p2, :cond_c

    .line 50
    aget-char v0, p0, p1

    const/16 v1, 0x2b

    if-ne v0, v1, :cond_c

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, -0x1

    :cond_c
    add-int v0, p1, p2

    add-int/lit8 v0, v0, -0x1

    .line 55
    aget-char v0, p0, v0

    add-int/lit8 v0, v0, -0x30

    packed-switch p2, :pswitch_data_68

    return v0

    .line 59
    :pswitch_18
    aget-char p2, p0, p1

    add-int/lit8 p2, p2, -0x30

    const v1, 0x5f5e100

    mul-int/2addr p2, v1

    add-int/2addr v0, p2

    add-int/lit8 p1, p1, 0x1

    .line 61
    :pswitch_23
    aget-char p2, p0, p1

    add-int/lit8 p2, p2, -0x30

    const v1, 0x989680

    mul-int/2addr p2, v1

    add-int/2addr v0, p2

    add-int/lit8 p1, p1, 0x1

    .line 63
    :pswitch_2e
    aget-char p2, p0, p1

    add-int/lit8 p2, p2, -0x30

    const v1, 0xf4240

    mul-int/2addr p2, v1

    add-int/2addr v0, p2

    add-int/lit8 p1, p1, 0x1

    .line 65
    :pswitch_39
    aget-char p2, p0, p1

    add-int/lit8 p2, p2, -0x30

    const v1, 0x186a0

    mul-int/2addr p2, v1

    add-int/2addr v0, p2

    add-int/lit8 p1, p1, 0x1

    .line 67
    :pswitch_44
    aget-char p2, p0, p1

    add-int/lit8 p2, p2, -0x30

    mul-int/lit16 p2, p2, 0x2710

    add-int/2addr v0, p2

    add-int/lit8 p1, p1, 0x1

    .line 69
    :pswitch_4d
    aget-char p2, p0, p1

    add-int/lit8 p2, p2, -0x30

    mul-int/lit16 p2, p2, 0x3e8

    add-int/2addr v0, p2

    add-int/lit8 p1, p1, 0x1

    .line 71
    :pswitch_56
    aget-char p2, p0, p1

    add-int/lit8 p2, p2, -0x30

    mul-int/lit8 p2, p2, 0x64

    add-int/2addr v0, p2

    add-int/lit8 p1, p1, 0x1

    .line 73
    :pswitch_5f
    aget-char p0, p0, p1

    add-int/lit8 p0, p0, -0x30

    mul-int/lit8 p0, p0, 0xa

    add-int/2addr v0, p0

    return v0

    nop

    :pswitch_data_68
    .packed-switch 0x2
        :pswitch_5f
        :pswitch_56
        :pswitch_4d
        :pswitch_44
        :pswitch_39
        :pswitch_2e
        :pswitch_23
        :pswitch_18
    .end packed-switch
.end method

.method public static parseLong(Ljava/lang/String;)J
    .registers 3

    .line 191
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x9

    if-gt v0, v1, :cond_e

    .line 193
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseInt(Ljava/lang/String;)I

    move-result p0

    int-to-long v0, p0

    return-wide v0

    .line 196
    :cond_e
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static parseLong([CII)J
    .registers 7

    add-int/lit8 p2, p2, -0x9

    .line 148
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseInt([CII)I

    move-result v0

    int-to-long v0, v0

    const-wide/32 v2, 0x3b9aca00

    mul-long/2addr v0, v2

    add-int/2addr p1, p2

    const/16 p2, 0x9

    .line 149
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseInt([CII)I

    move-result p0

    int-to-long p0, p0

    add-long/2addr v0, p0

    return-wide v0
.end method

.method public static parseLong19([CIZ)J
    .registers 8

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_3
    const/16 v3, 0x13

    if-ge v2, v3, :cond_15

    const-wide/16 v3, 0xa

    mul-long/2addr v0, v3

    add-int v3, p1, v2

    .line 174
    aget-char v3, p0, v3

    add-int/lit8 v3, v3, -0x30

    int-to-long v3, v3

    add-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_15
    if-eqz p2, :cond_19

    neg-long p0, v0

    return-wide p0

    :cond_19
    return-wide v0
.end method
