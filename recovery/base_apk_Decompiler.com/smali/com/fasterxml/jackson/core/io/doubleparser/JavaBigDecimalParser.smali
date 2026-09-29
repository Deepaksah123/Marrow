###### Class com.fasterxml.jackson.core.io.doubleparser.JavaBigDecimalParser (com.fasterxml.jackson.core.io.doubleparser.JavaBigDecimalParser)
.class public Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BYTE_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromByteArray;

.field private static final CHAR_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharArray;

.field private static final CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 102
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromByteArray;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromByteArray;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalParser;->BYTE_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromByteArray;

    .line 104
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharArray;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharArray;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalParser;->CHAR_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharArray;

    .line 106
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalParser;->CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;

    return-void
.end method

.method public static parseBigDecimal(Ljava/lang/CharSequence;)Ljava/math/BigDecimal;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 124
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {p0, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalParser;->parseBigDecimal(Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static parseBigDecimal(Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 140
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalParser;->CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;

    invoke-virtual {v0, p0, p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigDecimalFromCharSequence;->parseBigDecimalString(Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method
