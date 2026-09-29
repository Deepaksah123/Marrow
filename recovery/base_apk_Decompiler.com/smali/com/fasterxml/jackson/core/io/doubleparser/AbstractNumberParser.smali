###### Class com.fasterxml.jackson.core.io.doubleparser.AbstractNumberParser (com.fasterxml.jackson.core.io.doubleparser.AbstractNumberParser)
.class abstract Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final CHAR_TO_HEX_MAP:[B


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const/16 v0, 0x100

    .line 40
    new-array v0, v0, [B

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;->CHAR_TO_HEX_MAP:[B

    const/4 v1, -0x1

    .line 43
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    const/16 v0, 0x30

    :goto_c
    const/16 v1, 0x39

    if-gt v0, v1, :cond_1b

    .line 45
    sget-object v1, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;->CHAR_TO_HEX_MAP:[B

    add-int/lit8 v2, v0, -0x30

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    int-to-char v0, v0

    goto :goto_c

    :cond_1b
    const/16 v0, 0x41

    :goto_1d
    const/16 v1, 0x46

    if-gt v0, v1, :cond_2c

    .line 48
    sget-object v1, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;->CHAR_TO_HEX_MAP:[B

    add-int/lit8 v2, v0, -0x37

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    int-to-char v0, v0

    goto :goto_1d

    :cond_2c
    const/16 v0, 0x61

    :goto_2e
    const/16 v1, 0x66

    if-gt v0, v1, :cond_3d

    .line 51
    sget-object v1, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;->CHAR_TO_HEX_MAP:[B

    add-int/lit8 v2, v0, -0x57

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    int-to-char v0, v0

    goto :goto_2e

    .line 54
    :cond_3d
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;->CHAR_TO_HEX_MAP:[B

    const/16 v1, 0x2e

    const/4 v2, -0x4

    aput-byte v2, v0, v1

    return-void
.end method

.method constructor <init>()V
    .registers 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static charAt(Ljava/lang/CharSequence;II)C
    .registers 3

    if-ge p1, p2, :cond_7

    .line 94
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method protected static lookupHex(C)I
    .registers 2

    const/16 v0, 0x80

    if-ge p0, v0, :cond_9

    .line 122
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractNumberParser;->CHAR_TO_HEX_MAP:[B

    aget-byte p0, v0, p0

    return p0

    :cond_9
    const/4 p0, -0x1

    return p0
.end method
