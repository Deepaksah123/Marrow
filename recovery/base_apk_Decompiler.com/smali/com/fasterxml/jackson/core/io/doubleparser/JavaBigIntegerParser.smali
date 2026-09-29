###### Class com.fasterxml.jackson.core.io.doubleparser.JavaBigIntegerParser (com.fasterxml.jackson.core.io.doubleparser.JavaBigIntegerParser)
.class public Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BYTE_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromByteArray;

.field private static final CHAR_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharArray;

.field private static final CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 58
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromByteArray;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromByteArray;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerParser;->BYTE_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromByteArray;

    .line 60
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharArray;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharArray;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerParser;->CHAR_ARRAY_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharArray;

    .line 62
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerParser;->CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;

    return-void
.end method

.method public static parseBigInteger(Ljava/lang/CharSequence;)Ljava/math/BigInteger;
    .registers 5

    .line 79
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerParser;->CHAR_SEQUENCE_PARSER:Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v2, 0xa

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v3, v1, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/JavaBigIntegerFromCharSequence;->parseBigIntegerLiteral(Ljava/lang/CharSequence;III)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method
