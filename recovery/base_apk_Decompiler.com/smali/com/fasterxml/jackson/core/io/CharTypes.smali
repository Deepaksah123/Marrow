###### Class com.fasterxml.jackson.core.io.CharTypes (com.fasterxml.jackson.core.io.CharTypes)
.class public final Lcom/fasterxml/jackson/core/io/CharTypes;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;
    }
.end annotation


# static fields
.field protected static final HB:[B

.field protected static final HBlower:[B

.field protected static final HC:[C

.field protected static final HClower:[C

.field protected static final sHexValues:[I

.field protected static final sInputCodes:[I

.field protected static final sInputCodesComment:[I

.field protected static final sInputCodesJsNames:[I

.field protected static final sInputCodesUTF8:[I

.field protected static final sInputCodesUtf8JsNames:[I

.field protected static final sInputCodesWS:[I

.field protected static final sOutputEscapes128:[I


# direct methods
.method static constructor <clinit>()V
    .registers 15

    .line 7
    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->HC:[C

    .line 8
    const-string v1, "0123456789abcdef"

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    sput-object v1, Lcom/fasterxml/jackson/core/io/CharTypes;->HClower:[C

    .line 12
    array-length v0, v0

    .line 13
    new-array v1, v0, [B

    sput-object v1, Lcom/fasterxml/jackson/core/io/CharTypes;->HB:[B

    .line 14
    new-array v1, v0, [B

    sput-object v1, Lcom/fasterxml/jackson/core/io/CharTypes;->HBlower:[B

    const/4 v1, 0x0

    move v2, v1

    :goto_1b
    if-ge v2, v0, :cond_32

    .line 16
    sget-object v3, Lcom/fasterxml/jackson/core/io/CharTypes;->HB:[B

    sget-object v4, Lcom/fasterxml/jackson/core/io/CharTypes;->HC:[C

    aget-char v4, v4, v2

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    .line 17
    sget-object v3, Lcom/fasterxml/jackson/core/io/CharTypes;->HBlower:[B

    sget-object v4, Lcom/fasterxml/jackson/core/io/CharTypes;->HClower:[C

    aget-char v4, v4, v2

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1b

    :cond_32
    const/16 v0, 0x100

    .line 31
    new-array v2, v0, [I

    move v3, v1

    :goto_37
    const/16 v4, 0x20

    const/4 v5, -0x1

    if-ge v3, v4, :cond_41

    .line 34
    aput v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_37

    :cond_41
    const/16 v3, 0x22

    const/4 v6, 0x1

    .line 37
    aput v6, v2, v3

    const/16 v7, 0x5c

    .line 38
    aput v6, v2, v7

    .line 39
    sput-object v2, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodes:[I

    .line 48
    new-array v8, v0, [I

    .line 49
    invoke-static {v2, v1, v8, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v2, 0x80

    move v9, v2

    :goto_54
    if-ge v9, v0, :cond_74

    and-int/lit16 v10, v9, 0xe0

    const/16 v11, 0xc0

    if-ne v10, v11, :cond_5e

    const/4 v10, 0x2

    goto :goto_6f

    :cond_5e
    and-int/lit16 v10, v9, 0xf0

    const/16 v11, 0xe0

    if-ne v10, v11, :cond_66

    const/4 v10, 0x3

    goto :goto_6f

    :cond_66
    and-int/lit16 v10, v9, 0xf8

    const/16 v11, 0xf0

    if-ne v10, v11, :cond_6e

    const/4 v10, 0x4

    goto :goto_6f

    :cond_6e
    move v10, v5

    .line 65
    :goto_6f
    aput v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_54

    .line 67
    :cond_74
    sput-object v8, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesUTF8:[I

    .line 78
    new-array v8, v0, [I

    .line 80
    invoke-static {v8, v5}, Ljava/util/Arrays;->fill([II)V

    const/16 v9, 0x21

    :goto_7d
    if-ge v9, v0, :cond_8b

    int-to-char v10, v9

    .line 83
    invoke-static {v10}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v10

    if-eqz v10, :cond_88

    .line 84
    aput v1, v8, v9

    :cond_88
    add-int/lit8 v9, v9, 0x1

    goto :goto_7d

    :cond_8b
    const/16 v9, 0x40

    .line 90
    aput v1, v8, v9

    const/16 v9, 0x23

    .line 91
    aput v1, v8, v9

    const/16 v10, 0x2a

    .line 92
    aput v1, v8, v10

    const/16 v11, 0x2d

    .line 93
    aput v1, v8, v11

    const/16 v11, 0x2b

    .line 94
    aput v1, v8, v11

    .line 95
    sput-object v8, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesJsNames:[I

    .line 105
    new-array v11, v0, [I

    .line 107
    invoke-static {v8, v1, v11, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 108
    invoke-static {v11, v2, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 109
    sput-object v11, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesUtf8JsNames:[I

    .line 118
    new-array v8, v0, [I

    .line 120
    sget-object v11, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesUTF8:[I

    invoke-static {v11, v2, v8, v2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 123
    invoke-static {v8, v1, v4, v5}, Ljava/util/Arrays;->fill([IIII)V

    const/16 v12, 0x9

    .line 124
    aput v1, v8, v12

    const/16 v13, 0xa

    .line 125
    aput v13, v8, v13

    const/16 v14, 0xd

    .line 126
    aput v14, v8, v14

    .line 127
    aput v10, v8, v10

    .line 128
    sput-object v8, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesComment:[I

    .line 139
    new-array v8, v0, [I

    .line 140
    invoke-static {v11, v2, v8, v2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 145
    invoke-static {v8, v1, v4, v5}, Ljava/util/Arrays;->fill([IIII)V

    .line 146
    aput v6, v8, v4

    .line 147
    aput v6, v8, v12

    .line 148
    aput v13, v8, v13

    .line 149
    aput v14, v8, v14

    const/16 v6, 0x2f

    .line 150
    aput v6, v8, v6

    .line 151
    aput v9, v8, v9

    .line 152
    sput-object v8, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesWS:[I

    .line 161
    new-array v2, v2, [I

    move v6, v1

    :goto_e0
    if-ge v6, v4, :cond_e7

    .line 165
    aput v5, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_e0

    .line 168
    :cond_e7
    aput v3, v2, v3

    .line 169
    aput v7, v2, v7

    const/16 v3, 0x8

    const/16 v4, 0x62

    .line 171
    aput v4, v2, v3

    const/16 v3, 0x74

    .line 172
    aput v3, v2, v12

    const/16 v3, 0xc

    const/16 v4, 0x66

    .line 173
    aput v4, v2, v3

    const/16 v3, 0x6e

    .line 174
    aput v3, v2, v13

    const/16 v3, 0x72

    .line 175
    aput v3, v2, v14

    .line 176
    sput-object v2, Lcom/fasterxml/jackson/core/io/CharTypes;->sOutputEscapes128:[I

    .line 186
    new-array v0, v0, [I

    sput-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sHexValues:[I

    .line 188
    invoke-static {v0, v5}, Ljava/util/Arrays;->fill([II)V

    move v0, v1

    :goto_10d
    if-ge v0, v13, :cond_118

    .line 190
    sget-object v2, Lcom/fasterxml/jackson/core/io/CharTypes;->sHexValues:[I

    add-int/lit8 v3, v0, 0x30

    aput v0, v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_10d

    :cond_118
    :goto_118
    const/4 v0, 0x6

    if-ge v1, v0, :cond_12a

    .line 193
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sHexValues:[I

    add-int/lit8 v2, v1, 0xa

    add-int/lit8 v3, v1, 0x61

    aput v2, v0, v3

    add-int/lit8 v3, v1, 0x41

    .line 194
    aput v2, v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_118

    :cond_12a
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static appendQuoted(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .registers 9

    .line 260
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sOutputEscapes128:[I

    .line 261
    array-length v1, v0

    .line 262
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v2, :cond_46

    .line 263
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ge v4, v1, :cond_40

    .line 264
    aget v5, v0, v4

    if-eqz v5, :cond_40

    const/16 v5, 0x5c

    .line 268
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 269
    aget v5, v0, v4

    if-gez v5, :cond_3b

    const/16 v5, 0x75

    .line 279
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v5, 0x30

    .line 280
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 281
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 283
    sget-object v5, Lcom/fasterxml/jackson/core/io/CharTypes;->HC:[C

    shr-int/lit8 v6, v4, 0x4

    aget-char v6, v5, v6

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v4, v4, 0xf

    .line 284
    aget-char v4, v5, v4

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_43

    :cond_3b
    int-to-char v4, v5

    .line 286
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_43

    .line 265
    :cond_40
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_43
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_46
    return-void
.end method

.method public static charToHex(I)I
    .registers 2

    .line 240
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sHexValues:[I

    and-int/lit16 p0, p0, 0xff

    aget p0, v0, p0

    return p0
.end method

.method public static copyHexBytes(Z)[B
    .registers 1

    if-eqz p0, :cond_9

    .line 312
    sget-object p0, Lcom/fasterxml/jackson/core/io/CharTypes;->HB:[B

    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object p0

    goto :goto_f

    :cond_9
    sget-object p0, Lcom/fasterxml/jackson/core/io/CharTypes;->HBlower:[B

    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object p0

    :goto_f
    check-cast p0, [B

    return-object p0
.end method

.method public static copyHexChars(Z)[C
    .registers 1

    if-eqz p0, :cond_9

    .line 300
    sget-object p0, Lcom/fasterxml/jackson/core/io/CharTypes;->HC:[C

    invoke-virtual {p0}, [C->clone()Ljava/lang/Object;

    move-result-object p0

    goto :goto_f

    :cond_9
    sget-object p0, Lcom/fasterxml/jackson/core/io/CharTypes;->HClower:[C

    invoke-virtual {p0}, [C->clone()Ljava/lang/Object;

    move-result-object p0

    :goto_f
    check-cast p0, [C

    return-object p0
.end method

.method public static get7BitOutputEscapes()[I
    .registers 1

    .line 216
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sOutputEscapes128:[I

    return-object v0
.end method

.method public static get7BitOutputEscapes(I)[I
    .registers 2

    const/16 v0, 0x22

    if-ne p0, v0, :cond_7

    .line 231
    sget-object p0, Lcom/fasterxml/jackson/core/io/CharTypes;->sOutputEscapes128:[I

    return-object p0

    .line 233
    :cond_7
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;->instance:Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;->escapesFor(I)[I

    move-result-object p0

    return-object p0
.end method

.method public static getInputCodeComment()[I
    .registers 1

    .line 204
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesComment:[I

    return-object v0
.end method

.method public static getInputCodeLatin1()[I
    .registers 1

    .line 198
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodes:[I

    return-object v0
.end method

.method public static getInputCodeLatin1JsNames()[I
    .registers 1

    .line 201
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesJsNames:[I

    return-object v0
.end method

.method public static getInputCodeUtf8()[I
    .registers 1

    .line 199
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesUTF8:[I

    return-object v0
.end method

.method public static getInputCodeUtf8JsNames()[I
    .registers 1

    .line 202
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sInputCodesUtf8JsNames:[I

    return-object v0
.end method

.method public static hexToChar(I)C
    .registers 2

    .line 246
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->HC:[C

    aget-char p0, v0, p0

    return p0
.end method

###### Class com.fasterxml.jackson.core.io.CharTypes.AltEscapes (com.fasterxml.jackson.core.io.CharTypes$AltEscapes)
.class Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/io/CharTypes;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AltEscapes"
.end annotation


# static fields
.field public static final instance:Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;


# instance fields
.field private _altEscapes:[[I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 323
    new-instance v0, Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;->instance:Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    .line 322
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    .line 325
    new-array v0, v0, [[I

    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;->_altEscapes:[[I

    return-void
.end method


# virtual methods
.method public escapesFor(I)[I
    .registers 4

    .line 328
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;->_altEscapes:[[I

    aget-object v0, v0, p1

    if-nez v0, :cond_19

    .line 330
    sget-object v0, Lcom/fasterxml/jackson/core/io/CharTypes;->sOutputEscapes128:[I

    const/16 v1, 0x80

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    .line 332
    aget v1, v0, p1

    if-nez v1, :cond_15

    const/4 v1, -0x1

    .line 333
    aput v1, v0, p1

    .line 335
    :cond_15
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/CharTypes$AltEscapes;->_altEscapes:[[I

    aput-object v0, p0, p1

    :cond_19
    return-object v0
.end method
