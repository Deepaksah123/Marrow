###### Class com.fasterxml.jackson.core.io.doubleparser.JavaFloatParser (com.fasterxml.jackson.core.io.doubleparser.JavaFloatParser)
.class public Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BYTE_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromByteArray;

.field private static final CHAR_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharArray;

.field private static final CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharSequence;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 30
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromByteArray;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromByteArray;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatParser;->BYTE_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromByteArray;

    .line 32
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharArray;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharArray;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatParser;->CHAR_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharArray;

    .line 34
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharSequence;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharSequence;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatParser;->CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharSequence;

    return-void
.end method

.method public static parseFloat(Ljava/lang/CharSequence;)F
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 52
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {p0, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatParser;->parseFloat(Ljava/lang/CharSequence;II)F

    move-result p0

    return p0
.end method

.method public static parseFloat(Ljava/lang/CharSequence;II)F
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 68
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatParser;->CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharSequence;

    invoke-virtual {v0, p0, p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharSequence;->parseFloatingPointLiteral(Ljava/lang/CharSequence;II)J

    move-result-wide p0

    long-to-int p0, p0

    .line 69
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method
