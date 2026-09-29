###### Class com.fasterxml.jackson.core.io.doubleparser.JavaDoubleParser (com.fasterxml.jackson.core.io.doubleparser.JavaDoubleParser)
.class public Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BYTE_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromByteArray;

.field private static final CHAR_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharArray;

.field private static final CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharSequence;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 155
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromByteArray;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromByteArray;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleParser;->BYTE_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromByteArray;

    .line 157
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharArray;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharArray;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleParser;->CHAR_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharArray;

    .line 159
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharSequence;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharSequence;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleParser;->CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharSequence;

    return-void
.end method

.method public static parseDouble(Ljava/lang/CharSequence;)D
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 177
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {p0, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleParser;->parseDouble(Ljava/lang/CharSequence;II)D

    move-result-wide v0

    return-wide v0
.end method

.method public static parseDouble(Ljava/lang/CharSequence;II)D
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 193
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleParser;->CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharSequence;

    invoke-virtual {v0, p0, p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharSequence;->parseFloatingPointLiteral(Ljava/lang/CharSequence;II)J

    move-result-wide p0

    .line 194
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    return-wide p0
.end method
