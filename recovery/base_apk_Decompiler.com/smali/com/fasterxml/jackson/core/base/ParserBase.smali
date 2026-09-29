###### Class com.fasterxml.jackson.core.base.ParserBase (com.fasterxml.jackson.core.base.ParserBase)
.class public abstract Lcom/fasterxml/jackson/core/base/ParserBase;
.super Lcom/fasterxml/jackson/core/base/ParserMinimalBase;
.source "SourceFile"


# static fields
.field protected static final JSON_READ_CAPABILITIES:Lcom/fasterxml/jackson/core/util/JacksonFeatureSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/core/util/JacksonFeatureSet<",
            "Lcom/fasterxml/jackson/core/StreamReadCapability;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public _binaryValue:[B

.field protected _byteArrayBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

.field protected _closed:Z

.field public _currInputProcessed:J

.field public _currInputRow:I

.field public _currInputRowStart:I

.field protected _expLength:I

.field protected _fractLength:I

.field public _inputEnd:I

.field public _inputPtr:I

.field protected _intLength:I

.field public final _ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

.field public _nameCopied:Z

.field public _nameCopyBuffer:[C

.field public _nextToken:Lcom/fasterxml/jackson/core/JsonToken;

.field public _numTypesValid:I

.field protected _numberBigDecimal:Ljava/math/BigDecimal;

.field protected _numberBigInt:Ljava/math/BigInteger;

.field protected _numberDouble:D

.field protected _numberFloat:F

.field public _numberInt:I

.field protected _numberLong:J

.field protected _numberNegative:Z

.field protected _numberString:Ljava/lang/String;

.field public _parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

.field protected final _streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

.field public final _textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

.field public _tokenInputCol:I

.field public _tokenInputRow:I

.field public _tokenInputTotal:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 28
    sget-object v0, Lcom/fasterxml/jackson/core/base/ParserBase;->DEFAULT_READ_CAPABILITIES:Lcom/fasterxml/jackson/core/util/JacksonFeatureSet;

    sput-object v0, Lcom/fasterxml/jackson/core/base/ParserBase;->JSON_READ_CAPABILITIES:Lcom/fasterxml/jackson/core/util/JacksonFeatureSet;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;I)V
    .registers 4

    .line 254
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;-><init>(I)V

    const/4 v0, 0x1

    .line 89
    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_currInputRow:I

    .line 118
    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_tokenInputRow:I

    const/4 v0, 0x0

    .line 193
    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    .line 255
    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    .line 256
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/IOContext;->streamReadConstraints()Lcom/fasterxml/jackson/core/StreamReadConstraints;

    move-result-object v0

    if-nez v0, :cond_17

    .line 258
    invoke-static {}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->defaults()Lcom/fasterxml/jackson/core/StreamReadConstraints;

    move-result-object v0

    :cond_17
    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    .line 259
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/IOContext;->constructReadConstrainedTextBuffer()Lcom/fasterxml/jackson/core/util/TextBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    .line 260
    sget-object p1, Lcom/fasterxml/jackson/core/JsonParser$Feature;->STRICT_DUPLICATE_DETECTION:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->enabledIn(I)Z

    move-result p1

    if-eqz p1, :cond_2c

    .line 261
    invoke-static {p0}, Lcom/fasterxml/jackson/core/json/DupDetector;->rootDetector(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/json/DupDetector;

    move-result-object p1

    goto :goto_2d

    :cond_2c
    const/4 p1, 0x0

    .line 262
    :goto_2d
    invoke-static {p1}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->createRootContext(Lcom/fasterxml/jackson/core/json/DupDetector;)Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    return-void
.end method

.method private _parseSlowFloat(I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x10

    if-ne p1, v0, :cond_12

    const/4 p1, 0x0

    .line 977
    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigDecimal:Ljava/math/BigDecimal;

    .line 978
    iget-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    .line 979
    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void

    :cond_12
    const/16 v0, 0x20

    if-ne p1, v0, :cond_24

    const/4 p1, 0x0

    .line 981
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    .line 982
    iget-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    .line 983
    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void

    :cond_24
    const-wide/16 v0, 0x0

    .line 989
    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    .line 990
    iget-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    const/16 p1, 0x8

    .line 991
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void
.end method

.method private _parseSlowInt(I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 997
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_c

    const/4 v1, 0x2

    if-ne p1, v1, :cond_f

    .line 1000
    :cond_c
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportTooLongIntegral(ILjava/lang/String;)V

    :cond_f
    const/16 v1, 0x8

    if-eq p1, v1, :cond_20

    const/16 v2, 0x20

    if-eq p1, v2, :cond_20

    const/4 p1, 0x0

    .line 1007
    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;

    .line 1008
    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    const/4 p1, 0x4

    .line 1009
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void

    .line 1003
    :cond_20
    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    .line 1004
    iput v1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void
.end method

.method protected static growArrayBy([II)[I
    .registers 3

    if-nez p0, :cond_5

    .line 1543
    new-array p0, p1, [I

    return-object p0

    .line 1545
    :cond_5
    array-length v0, p0

    add-int/2addr v0, p1

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected _checkStdFeatureChanges(II)V
    .registers 4

    .line 337
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->STRICT_DUPLICATE_DETECTION:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    move-result v0

    and-int/2addr p2, v0

    if-eqz p2, :cond_2a

    and-int/2addr p1, v0

    if-eqz p1, :cond_2a

    .line 341
    iget-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getDupDetector()Lcom/fasterxml/jackson/core/json/DupDetector;

    move-result-object p1

    if-nez p1, :cond_21

    .line 342
    iget-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-static {p0}, Lcom/fasterxml/jackson/core/json/DupDetector;->rootDetector(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/json/DupDetector;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->withDupDetector(Lcom/fasterxml/jackson/core/json/DupDetector;)Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    return-void

    .line 344
    :cond_21
    iget-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->withDupDetector(Lcom/fasterxml/jackson/core/json/DupDetector;)Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    :cond_2a
    return-void
.end method

.method protected abstract _closeInput()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected _contentReference()Lcom/fasterxml/jackson/core/io/ContentReference;
    .registers 3

    .line 1534
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->INCLUDE_SOURCE_IN_LOCATION:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    iget v1, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->enabledIn(I)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1535
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/IOContext;->contentReference()Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object p0

    return-object p0

    .line 1537
    :cond_11
    invoke-static {}, Lcom/fasterxml/jackson/core/io/ContentReference;->unknown()Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object p0

    return-object p0
.end method

.method protected _convertBigDecimalToBigInteger(Ljava/math/BigDecimal;)Ljava/math/BigInteger;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1221
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    invoke-virtual {p1}, Ljava/math/BigDecimal;->scale()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->validateBigIntegerScale(I)V

    .line 1222
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method protected final _decodeBase64Escape(Lcom/fasterxml/jackson/core/Base64Variant;CI)I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x5c

    if-ne p2, v0, :cond_23

    .line 1455
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_decodeEscaped()C

    move-result p2

    const/16 v0, 0x20

    if-gt p2, v0, :cond_10

    if-nez p3, :cond_10

    const/4 p0, -0x1

    return p0

    .line 1463
    :cond_10
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    move-result v0

    if-gez v0, :cond_22

    const/4 v1, -0x2

    if-ne v0, v1, :cond_1d

    const/4 v1, 0x2

    if-lt p3, v1, :cond_1d

    goto :goto_22

    .line 1467
    :cond_1d
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportInvalidBase64Char(Lcom/fasterxml/jackson/core/Base64Variant;II)Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0

    :cond_22
    :goto_22
    return v0

    .line 1453
    :cond_23
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportInvalidBase64Char(Lcom/fasterxml/jackson/core/Base64Variant;II)Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0
.end method

.method protected final _decodeBase64Escape(Lcom/fasterxml/jackson/core/Base64Variant;II)I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x5c

    if-ne p2, v0, :cond_20

    .line 1433
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_decodeEscaped()C

    move-result p2

    const/16 v0, 0x20

    if-gt p2, v0, :cond_10

    if-nez p3, :cond_10

    const/4 p0, -0x1

    return p0

    .line 1441
    :cond_10
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(I)I

    move-result v0

    if-gez v0, :cond_1f

    const/4 v1, -0x2

    if-ne v0, v1, :cond_1a

    goto :goto_1f

    .line 1444
    :cond_1a
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportInvalidBase64Char(Lcom/fasterxml/jackson/core/Base64Variant;II)Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0

    :cond_1f
    :goto_1f
    return v0

    .line 1431
    :cond_20
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportInvalidBase64Char(Lcom/fasterxml/jackson/core/Base64Variant;II)Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0
.end method

.method protected _decodeEscaped()C
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1424
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method protected final _eofAsNextChar()I
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 529
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_handleEOF()V

    const/4 p0, -0x1

    return p0
.end method

.method protected _finishString()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method protected _getBigDecimal()Ljava/math/BigDecimal;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1256
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigDecimal:Ljava/math/BigDecimal;

    if-eqz v0, :cond_5

    return-object v0

    .line 1258
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_39

    .line 1263
    :try_start_9
    sget-object v1, Lcom/fasterxml/jackson/core/StreamReadFeature;->USE_FAST_BIG_NUMBER_PARSER:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 1265
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonParser;->isEnabled(Lcom/fasterxml/jackson/core/StreamReadFeature;)Z

    move-result v1

    .line 1263
    invoke-static {v0, v1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseBigDecimal(Ljava/lang/String;Z)Ljava/math/BigDecimal;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigDecimal:Ljava/math/BigDecimal;
    :try_end_15
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_15} :catch_16

    goto :goto_33

    :catch_16
    move-exception v0

    .line 1267
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Malformed numeric value ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/core/base/ParserBase;->_longNumberDesc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_wrapError(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_33
    const/4 v0, 0x0

    .line 1269
    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    .line 1270
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigDecimal:Ljava/math/BigDecimal;

    return-object p0

    .line 1259
    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "cannot get BigDecimal from current parser state"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected _getBigInteger()Ljava/math/BigInteger;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1232
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;

    if-eqz v0, :cond_5

    return-object v0

    .line 1234
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_39

    .line 1239
    :try_start_9
    sget-object v1, Lcom/fasterxml/jackson/core/StreamReadFeature;->USE_FAST_BIG_NUMBER_PARSER:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 1241
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonParser;->isEnabled(Lcom/fasterxml/jackson/core/StreamReadFeature;)Z

    move-result v1

    .line 1239
    invoke-static {v0, v1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseBigInteger(Ljava/lang/String;Z)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;
    :try_end_15
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_15} :catch_16

    goto :goto_33

    :catch_16
    move-exception v0

    .line 1243
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Malformed numeric value ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/core/base/ParserBase;->_longNumberDesc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_wrapError(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_33
    const/4 v0, 0x0

    .line 1245
    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    .line 1246
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;

    return-object p0

    .line 1235
    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "cannot get BigInteger from current parser state"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public _getByteArrayBuilder()Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;
    .registers 2

    .line 541
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_byteArrayBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    if-nez v0, :cond_c

    .line 542
    new-instance v0, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_byteArrayBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    goto :goto_f

    .line 544
    :cond_c
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->reset()V

    .line 546
    :goto_f
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_byteArrayBuilder:Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    return-object p0
.end method

.method protected _getNumberDouble()D
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1280
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_31

    .line 1282
    :try_start_4
    sget-object v1, Lcom/fasterxml/jackson/core/StreamReadFeature;->USE_FAST_DOUBLE_PARSER:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 1283
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonParser;->isEnabled(Lcom/fasterxml/jackson/core/StreamReadFeature;)Z

    move-result v1

    .line 1282
    invoke-static {v0, v1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseDouble(Ljava/lang/String;Z)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D
    :try_end_10
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_10} :catch_11

    goto :goto_2e

    :catch_11
    move-exception v0

    .line 1285
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Malformed numeric value ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/core/base/ParserBase;->_longNumberDesc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_wrapError(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2e
    const/4 v0, 0x0

    .line 1287
    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    .line 1289
    :cond_31
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    return-wide v0
.end method

.method protected _getNumberFloat()F
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1299
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_31

    .line 1301
    :try_start_4
    sget-object v1, Lcom/fasterxml/jackson/core/StreamReadFeature;->USE_FAST_DOUBLE_PARSER:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 1302
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonParser;->isEnabled(Lcom/fasterxml/jackson/core/StreamReadFeature;)Z

    move-result v1

    .line 1301
    invoke-static {v0, v1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseFloat(Ljava/lang/String;Z)F

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F
    :try_end_10
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_10} :catch_11

    goto :goto_2e

    :catch_11
    move-exception v0

    .line 1304
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Malformed numeric value ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/core/base/ParserBase;->_longNumberDesc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_wrapError(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2e
    const/4 v0, 0x0

    .line 1306
    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    .line 1308
    :cond_31
    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    return p0
.end method

.method protected _handleBase64MissingPadding(Lcom/fasterxml/jackson/core/Base64Variant;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1503
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->missingPaddingMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportError(Ljava/lang/String;)V

    return-void
.end method

.method protected _handleEOF()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 510
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->inRoot()Z

    move-result v0

    if-nez v0, :cond_2d

    .line 511
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->inArray()Z

    move-result v0

    if-eqz v0, :cond_13

    const-string v0, "Array"

    goto :goto_15

    :cond_13
    const-string v0, "Object"

    .line 512
    :goto_15
    iget-object v1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    .line 515
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_contentReference()Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/core/JsonStreamContext;->startLocation(Lcom/fasterxml/jackson/core/io/ContentReference;)Lcom/fasterxml/jackson/core/JsonLocation;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 512
    const-string v1, ": expected close marker for %s (start marker at %s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportInvalidEOF(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    :cond_2d
    return-void
.end method

.method protected _handleUnrecognizedCharacterEscape(C)C
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonProcessingException;
        }
    .end annotation

    .line 1346
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->isEnabled(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    move-result v0

    if-nez v0, :cond_2a

    const/16 v0, 0x27

    if-ne p1, v0, :cond_15

    .line 1350
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_SINGLE_QUOTES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->isEnabled(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    move-result v0

    if-eqz v0, :cond_15

    goto :goto_2a

    .line 1353
    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unrecognized character escape "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getCharDesc(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportError(Ljava/lang/String;)V

    :cond_2a
    :goto_2a
    return p1
.end method

.method protected _parseIntValue()I
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 945
    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_closed:Z

    if-eqz v0, :cond_9

    .line 946
    const-string v0, "Internal error: _parseNumericValue called when parser instance closed"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportError(Ljava/lang/String;)V

    .line 949
    :cond_9
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_23

    .line 950
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_intLength:I

    const/16 v1, 0x9

    if-gt v0, v1, :cond_23

    .line 951
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    iget-boolean v1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberNegative:Z

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsInt(Z)I

    move-result v0

    .line 952
    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    .line 953
    iput v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return v0

    .line 958
    :cond_23
    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseNumericValue(I)V

    .line 959
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/2addr v0, v2

    if-nez v0, :cond_2e

    .line 960
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->convertNumberToInt()V

    .line 962
    :cond_2e
    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    return p0
.end method

.method protected _parseNumericValue(I)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 881
    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_closed:Z

    if-eqz v0, :cond_9

    .line 882
    const-string v0, "Internal error: _parseNumericValue called when parser instance closed"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportError(Ljava/lang/String;)V

    .line 886
    :cond_9
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_82

    .line 887
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_intLength:I

    const/16 v1, 0x9

    const/4 v2, 0x1

    if-gt v0, v1, :cond_23

    .line 890
    iget-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberNegative:Z

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsInt(Z)I

    move-result p1

    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    .line 891
    iput v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void

    :cond_23
    const/16 v1, 0x12

    const/4 v3, 0x2

    if-gt v0, v1, :cond_57

    .line 895
    iget-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    iget-boolean v1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberNegative:Z

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsLong(Z)J

    move-result-wide v4

    const/16 p1, 0xa

    if-ne v0, p1, :cond_52

    .line 898
    iget-boolean p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberNegative:Z

    if-eqz p1, :cond_45

    const-wide/32 v0, -0x80000000

    cmp-long p1, v4, v0

    if-ltz p1, :cond_52

    long-to-int p1, v4

    .line 900
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    .line 901
    iput v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void

    :cond_45
    const-wide/32 v0, 0x7fffffff

    cmp-long p1, v4, v0

    if-gtz p1, :cond_52

    long-to-int p1, v4

    .line 906
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    .line 907
    iput v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void

    .line 912
    :cond_52
    iput-wide v4, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    .line 913
    iput v3, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void

    :cond_57
    const/16 v1, 0x13

    if-ne v0, v1, :cond_7e

    .line 918
    iget-object v1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->getTextBuffer()[C

    move-result-object v1

    .line 919
    iget-object v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/TextBuffer;->getTextOffset()I

    move-result v2

    .line 920
    iget-boolean v4, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberNegative:Z

    if-eqz v4, :cond_6d

    add-int/lit8 v2, v2, 0x1

    .line 923
    :cond_6d
    invoke-static {v1, v2, v0, v4}, Lcom/fasterxml/jackson/core/io/NumberInput;->inLongRange([CIIZ)Z

    move-result v0

    if-eqz v0, :cond_7e

    .line 924
    iget-boolean p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberNegative:Z

    invoke-static {v1, v2, p1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseLong19([CIZ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    .line 925
    iput v3, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void

    .line 929
    :cond_7e
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseSlowInt(I)V

    return-void

    .line 932
    :cond_82
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_8c

    .line 933
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseSlowFloat(I)V

    return-void

    .line 936
    :cond_8c
    const-string p1, "Current token (%s) not numeric, can not use numeric value accessors"

    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportError(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public _releaseBuffers()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 495
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->releaseBuffers()V

    .line 496
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_nameCopyBuffer:[C

    if-eqz v0, :cond_11

    const/4 v1, 0x0

    .line 498
    iput-object v1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_nameCopyBuffer:[C

    .line 499
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_ioContext:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/io/IOContext;->releaseNameCopyBuffer([C)V

    :cond_11
    return-void
.end method

.method protected _reportMismatchedEndMarker(IC)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1336
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->getParsingContext()Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object v0

    int-to-char p1, p1

    .line 1339
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->typeDesc()Ljava/lang/String;

    move-result-object v1

    .line 1340
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_contentReference()Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/core/JsonStreamContext;->startLocation(Lcom/fasterxml/jackson/core/io/ContentReference;)Lcom/fasterxml/jackson/core/JsonLocation;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    filled-new-array {p1, p2, v1, v0}, [Ljava/lang/Object;

    move-result-object p1

    .line 1337
    const-string p2, "Unexpected close marker \'%s\': expected \'%c\' (for %s starting at %s)"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportError(Ljava/lang/String;)V

    return-void
.end method

.method protected _reportTooLongIntegral(ILjava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_7

    .line 1017
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportOverflowInt(Ljava/lang/String;)V

    return-void

    .line 1019
    :cond_7
    invoke-virtual {p0, p2}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportOverflowLong(Ljava/lang/String;)V

    return-void
.end method

.method protected _throwUnquotedSpace(ILjava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1371
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_UNQUOTED_CONTROL_CHARS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->isEnabled(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v0, 0x20

    if-gt p1, v0, :cond_d

    return-void

    :cond_d
    int-to-char p1, p1

    .line 1373
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Illegal unquoted character ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getCharDesc(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "): has to be escaped using backslash to be included in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1374
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportError(Ljava/lang/String;)V

    return-void
.end method

.method protected _validJsonTokenList()Ljava/lang/String;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1388
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_validJsonValueList()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected _validJsonValueList()Ljava/lang/String;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1402
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_NON_NUMERIC_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->isEnabled(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z

    move-result p0

    if-eqz p0, :cond_b

    .line 1403
    const-string p0, "(JSON String, Number (or \'NaN\'/\'INF\'/\'+INF\'), Array, Object or token \'null\', \'true\' or \'false\')"

    return-object p0

    .line 1405
    :cond_b
    const-string p0, "(JSON String, Number, Array, Object or token \'null\', \'true\' or \'false\')"

    return-object p0
.end method

.method public close()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 387
    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_closed:Z

    if-nez v0, :cond_1d

    .line 389
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_inputPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_inputEnd:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_inputPtr:I

    const/4 v0, 0x1

    .line 390
    iput-boolean v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_closed:Z

    .line 392
    :try_start_11
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_closeInput()V
    :try_end_14
    .catchall {:try_start_11 .. :try_end_14} :catchall_18

    .line 396
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_releaseBuffers()V

    return-void

    :catchall_18
    move-exception v0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_releaseBuffers()V

    .line 397
    throw v0

    :cond_1d
    return-void
.end method

.method protected convertNumberToBigDecimal()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1198
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1b

    .line 1201
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-nez v0, :cond_e

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    .line 1202
    :cond_e
    sget-object v1, Lcom/fasterxml/jackson/core/StreamReadFeature;->USE_FAST_BIG_NUMBER_PARSER:Lcom/fasterxml/jackson/core/StreamReadFeature;

    .line 1204
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/JsonParser;->isEnabled(Lcom/fasterxml/jackson/core/StreamReadFeature;)Z

    move-result v1

    .line 1202
    invoke-static {v0, v1}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseBigDecimal(Ljava/lang/String;Z)Ljava/math/BigDecimal;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigDecimal:Ljava/math/BigDecimal;

    goto :goto_49

    :cond_1b
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2b

    .line 1206
    new-instance v0, Ljava/math/BigDecimal;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigInteger()Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigDecimal:Ljava/math/BigDecimal;

    goto :goto_49

    :cond_2b
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_38

    .line 1208
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigDecimal:Ljava/math/BigDecimal;

    goto :goto_49

    :cond_38
    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_46

    .line 1210
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigDecimal:Ljava/math/BigDecimal;

    goto :goto_49

    .line 1212
    :cond_46
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_throwInternal()V

    .line 1214
    :goto_49
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void
.end method

.method protected convertNumberToBigInteger()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1099
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_11

    .line 1101
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigDecimal()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_convertBigDecimalToBigInteger(Ljava/math/BigDecimal;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;

    goto :goto_51

    :cond_11
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1e

    .line 1103
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;

    goto :goto_51

    :cond_1e
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_2c

    .line 1105
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;

    goto :goto_51

    :cond_2c
    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4e

    .line 1107
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_3f

    .line 1108
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigDecimal()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_convertBigDecimalToBigInteger(Ljava/math/BigDecimal;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;

    goto :goto_51

    .line 1110
    :cond_3f
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_convertBigDecimalToBigInteger(Ljava/math/BigDecimal;)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;

    goto :goto_51

    .line 1113
    :cond_4e
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_throwInternal()V

    .line 1115
    :goto_51
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void
.end method

.method protected convertNumberToDouble()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1126
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1c

    .line 1127
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_11

    .line 1128
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    goto :goto_64

    .line 1130
    :cond_11
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigDecimal()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    goto :goto_64

    :cond_1c
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_36

    .line 1133
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_2b

    .line 1134
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    goto :goto_64

    .line 1136
    :cond_2b
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigInteger()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    goto :goto_64

    :cond_36
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_40

    .line 1139
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    long-to-double v0, v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    goto :goto_64

    :cond_40
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_4a

    .line 1141
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    int-to-double v0, v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    goto :goto_64

    :cond_4a
    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_61

    .line 1143
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_59

    .line 1144
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    goto :goto_64

    .line 1146
    :cond_59
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberFloat()F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    goto :goto_64

    .line 1149
    :cond_61
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_throwInternal()V

    .line 1151
    :goto_64
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void
.end method

.method protected convertNumberToFloat()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1162
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1c

    .line 1163
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_11

    .line 1164
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberFloat()F

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    goto :goto_64

    .line 1166
    :cond_11
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigDecimal()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    goto :goto_64

    :cond_1c
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_36

    .line 1169
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_2b

    .line 1170
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberFloat()F

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    goto :goto_64

    .line 1172
    :cond_2b
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigInteger()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    goto :goto_64

    :cond_36
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_40

    .line 1175
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    long-to-float v0, v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    goto :goto_64

    :cond_40
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_4a

    .line 1177
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    int-to-float v0, v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    goto :goto_64

    :cond_4a
    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_61

    .line 1179
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_59

    .line 1180
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberFloat()F

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    goto :goto_64

    .line 1182
    :cond_59
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberFloat:F

    goto :goto_64

    .line 1185
    :cond_61
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_throwInternal()V

    .line 1187
    :goto_64
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void
.end method

.method protected convertNumberToInt()V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1032
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1c

    .line 1034
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v0, v3, v0

    if-eqz v0, :cond_19

    .line 1036
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportOverflowInt(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 1038
    :cond_19
    iput v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    goto :goto_81

    :cond_1c
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_3e

    .line 1040
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigInteger()Ljava/math/BigInteger;

    move-result-object v0

    .line 1041
    sget-object v1, Lcom/fasterxml/jackson/core/base/ParserBase;->BI_MIN_INT:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-gtz v1, :cond_34

    sget-object v1, Lcom/fasterxml/jackson/core/base/ParserBase;->BI_MAX_INT:Ljava/math/BigInteger;

    .line 1042
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-gez v1, :cond_37

    .line 1043
    :cond_34
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportOverflowInt()V

    .line 1045
    :cond_37
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    goto :goto_81

    :cond_3e
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_5c

    .line 1048
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    const-wide/high16 v2, -0x3e20000000000000L    # -2.147483648E9

    cmpg-double v2, v0, v2

    if-ltz v2, :cond_55

    const-wide v2, 0x41dfffffffc00000L    # 2.147483647E9

    cmpl-double v2, v0, v2

    if-lez v2, :cond_58

    .line 1050
    :cond_55
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportOverflowInt()V

    :cond_58
    double-to-int v0, v0

    .line 1052
    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    goto :goto_81

    :cond_5c
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_7e

    .line 1054
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigDecimal()Ljava/math/BigDecimal;

    move-result-object v0

    .line 1055
    sget-object v1, Lcom/fasterxml/jackson/core/base/ParserBase;->BD_MIN_INT:Ljava/math/BigDecimal;

    invoke-virtual {v1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v1

    if-gtz v1, :cond_74

    sget-object v1, Lcom/fasterxml/jackson/core/base/ParserBase;->BD_MAX_INT:Ljava/math/BigDecimal;

    .line 1056
    invoke-virtual {v1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v1

    if-gez v1, :cond_77

    .line 1057
    :cond_74
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportOverflowInt()V

    .line 1059
    :cond_77
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    goto :goto_81

    .line 1061
    :cond_7e
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_throwInternal()V

    .line 1063
    :goto_81
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void
.end method

.method protected convertNumberToLong()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1068
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_c

    .line 1069
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    goto :goto_6e

    :cond_c
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2e

    .line 1071
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigInteger()Ljava/math/BigInteger;

    move-result-object v0

    .line 1072
    sget-object v1, Lcom/fasterxml/jackson/core/base/ParserBase;->BI_MIN_LONG:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-gtz v1, :cond_24

    sget-object v1, Lcom/fasterxml/jackson/core/base/ParserBase;->BI_MAX_LONG:Ljava/math/BigInteger;

    .line 1073
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-gez v1, :cond_27

    .line 1074
    :cond_24
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportOverflowLong()V

    .line 1076
    :cond_27
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    goto :goto_6e

    :cond_2e
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_49

    .line 1079
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    const-wide/high16 v2, -0x3c20000000000000L    # -9.223372036854776E18

    cmpg-double v2, v0, v2

    if-ltz v2, :cond_42

    const-wide/high16 v2, 0x43e0000000000000L    # 9.223372036854776E18

    cmpl-double v2, v0, v2

    if-lez v2, :cond_45

    .line 1081
    :cond_42
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportOverflowLong()V

    :cond_45
    double-to-long v0, v0

    .line 1083
    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    goto :goto_6e

    :cond_49
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_6b

    .line 1085
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigDecimal()Ljava/math/BigDecimal;

    move-result-object v0

    .line 1086
    sget-object v1, Lcom/fasterxml/jackson/core/base/ParserBase;->BD_MIN_LONG:Ljava/math/BigDecimal;

    invoke-virtual {v1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v1

    if-gtz v1, :cond_61

    sget-object v1, Lcom/fasterxml/jackson/core/base/ParserBase;->BD_MAX_LONG:Ljava/math/BigDecimal;

    .line 1087
    invoke-virtual {v1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v1

    if-gez v1, :cond_64

    .line 1088
    :cond_61
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportOverflowLong()V

    .line 1090
    :cond_64
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    goto :goto_6e

    .line 1092
    :cond_6b
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_throwInternal()V

    .line 1094
    :goto_6e
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    return-void
.end method

.method protected createChildArrayContext(II)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1319
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->createChildArrayContext(II)Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    .line 1320
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonStreamContext;->getNestingDepth()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->validateNestingDepth(I)V

    return-void
.end method

.method protected createChildObjectContext(II)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1325
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->createChildObjectContext(II)Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    .line 1326
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonStreamContext;->getNestingDepth()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->validateNestingDepth(I)V

    return-void
.end method

.method public getBigIntegerValue()Ljava/math/BigInteger;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 792
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x4

    if-nez v1, :cond_14

    const/4 v1, 0x4

    if-nez v0, :cond_c

    .line 794
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseNumericValue(I)V

    .line 796
    :cond_c
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/2addr v0, v1

    if-nez v0, :cond_14

    .line 797
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->convertNumberToBigInteger()V

    .line 800
    :cond_14
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public getBinaryValue(Lcom/fasterxml/jackson/core/Base64Variant;)[B
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 446
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_binaryValue:[B

    if-nez v0, :cond_33

    .line 447
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_22

    .line 448
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Current token ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") not VALUE_STRING, can not access as binary"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_reportError(Ljava/lang/String;)V

    .line 450
    :cond_22
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getByteArrayBuilder()Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    move-result-object v0

    .line 451
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0, p1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_decodeBase64(Ljava/lang/String;Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;Lcom/fasterxml/jackson/core/Base64Variant;)V

    .line 452
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->toByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_binaryValue:[B

    .line 454
    :cond_33
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_binaryValue:[B

    return-object p0
.end method

.method public getCurrentLocation()Lcom/fasterxml/jackson/core/JsonLocation;
    .registers 12

    .line 423
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_inputPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_currInputRowStart:I

    .line 424
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_contentReference()Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v3

    iget-wide v4, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_currInputProcessed:J

    new-instance v10, Lcom/fasterxml/jackson/core/JsonLocation;

    const-wide/16 v6, -0x1

    iget v2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_inputPtr:I

    int-to-long v8, v2

    add-long/2addr v8, v4

    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_currInputRow:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    move-object v2, v10

    move-wide v4, v6

    move-wide v6, v8

    move v8, p0

    move v9, v0

    invoke-direct/range {v2 .. v9}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    return-object v10
.end method

.method public getCurrentName()Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 362
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_c

    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_19

    .line 363
    :cond_c
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getParent()Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 365
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->getCurrentName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 368
    :cond_19
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->getCurrentName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public getDecimalValue()Ljava/math/BigDecimal;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 842
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x10

    if-nez v1, :cond_15

    const/16 v1, 0x10

    if-nez v0, :cond_d

    .line 844
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseNumericValue(I)V

    .line 846
    :cond_d
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/2addr v0, v1

    if-nez v0, :cond_15

    .line 847
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->convertNumberToBigDecimal()V

    .line 850
    :cond_15
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigDecimal()Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public getDoubleValue()D
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 828
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x8

    if-nez v1, :cond_15

    const/16 v1, 0x8

    if-nez v0, :cond_d

    .line 830
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseNumericValue(I)V

    .line 832
    :cond_d
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/2addr v0, v1

    if-nez v0, :cond_15

    .line 833
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->convertNumberToDouble()V

    .line 836
    :cond_15
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public getFloatValue()F
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 814
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x20

    if-nez v1, :cond_15

    const/16 v1, 0x20

    if-nez v0, :cond_d

    .line 816
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseNumericValue(I)V

    .line 818
    :cond_d
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/2addr v0, v1

    if-nez v0, :cond_15

    .line 819
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->convertNumberToFloat()V

    .line 822
    :cond_15
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberFloat()F

    move-result p0

    return p0
.end method

.method public getIntValue()I
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 764
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x1

    if-nez v1, :cond_12

    if-nez v0, :cond_d

    .line 766
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseIntValue()I

    move-result p0

    return p0

    :cond_d
    if-nez v1, :cond_12

    .line 769
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->convertNumberToInt()V

    .line 772
    :cond_12
    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    return p0
.end method

.method public getLongValue()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 778
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x2

    if-nez v1, :cond_14

    const/4 v1, 0x2

    if-nez v0, :cond_c

    .line 780
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseNumericValue(I)V

    .line 782
    :cond_c
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/2addr v0, v1

    if-nez v0, :cond_14

    .line 783
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->convertNumberToLong()V

    .line 786
    :cond_14
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    return-wide v0
.end method

.method public getNumberType()Lcom/fasterxml/jackson/core/JsonParser$NumberType;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 733
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    if-nez v0, :cond_8

    const/4 v0, 0x0

    .line 734
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseNumericValue(I)V

    .line 736
    :cond_8
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_21

    .line 737
    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v0, p0, 0x1

    if-eqz v0, :cond_17

    .line 738
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->INT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    return-object p0

    :cond_17
    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_1e

    .line 741
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->LONG:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    return-object p0

    .line 743
    :cond_1e
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->BIG_INTEGER:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    return-object p0

    .line 752
    :cond_21
    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v0, p0, 0x10

    if-eqz v0, :cond_2a

    .line 753
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->BIG_DECIMAL:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    return-object p0

    :cond_2a
    and-int/lit8 p0, p0, 0x20

    if-eqz p0, :cond_31

    .line 756
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->FLOAT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    return-object p0

    .line 758
    :cond_31
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->DOUBLE:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    return-object p0
.end method

.method public getNumberValue()Ljava/lang/Number;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 620
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    if-nez v0, :cond_8

    const/4 v0, 0x0

    .line 621
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseNumericValue(I)V

    .line 624
    :cond_8
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_32

    .line 625
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_1b

    .line 626
    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1b
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_26

    .line 629
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_26
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2f

    .line 632
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 634
    :cond_2f
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_throwInternal()V

    .line 639
    :cond_32
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3d

    .line 640
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigDecimal()Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0

    :cond_3d
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4a

    .line 643
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberFloat()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_4a
    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_51

    .line 646
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_throwInternal()V

    .line 648
    :cond_51
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public getNumberValueDeferred()Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 689
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_3c

    .line 690
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    if-nez v0, :cond_e

    const/4 v0, 0x0

    .line 691
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_parseNumericValue(I)V

    .line 693
    :cond_e
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_1b

    .line 694
    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberInt:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1b
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_26

    .line 697
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberLong:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_26
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_39

    .line 701
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberBigInt:Ljava/math/BigInteger;

    if-eqz v0, :cond_2f

    return-object v0

    .line 703
    :cond_2f
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberString:Ljava/lang/String;

    if-eqz v0, :cond_34

    return-object v0

    .line 706
    :cond_34
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 708
    :cond_39
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_throwInternal()V

    .line 710
    :cond_3c
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_6e

    .line 713
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4d

    .line 714
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getBigDecimal()Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0

    :cond_4d
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_5a

    .line 717
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_5a
    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_67

    .line 720
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberFloat()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    .line 724
    :cond_67
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 727
    :cond_6e
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getParsingContext()Lcom/fasterxml/jackson/core/JsonStreamContext;
    .registers 1

    .line 24
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->getParsingContext()Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object p0

    return-object p0
.end method

.method public getParsingContext()Lcom/fasterxml/jackson/core/json/JsonReadContext;
    .registers 1

    .line 402
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    return-object p0
.end method

.method public getTokenCharacterOffset()J
    .registers 3

    .line 463
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_tokenInputTotal:J

    return-wide v0
.end method

.method public getTokenColumnNr()I
    .registers 1

    .line 467
    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_tokenInputCol:I

    if-gez p0, :cond_5

    return p0

    :cond_5
    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public getTokenLineNr()I
    .registers 1

    .line 464
    iget p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_tokenInputRow:I

    return p0
.end method

.method public getTokenLocation()Lcom/fasterxml/jackson/core/JsonLocation;
    .registers 10

    .line 411
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_contentReference()Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v1

    .line 412
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->getTokenCharacterOffset()J

    move-result-wide v4

    .line 413
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->getTokenLineNr()I

    move-result v6

    .line 414
    new-instance v8, Lcom/fasterxml/jackson/core/JsonLocation;

    const-wide/16 v2, -0x1

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->getTokenColumnNr()I

    move-result v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JJII)V

    return-object v8
.end method

.method public hasTextCharacters()Z
    .registers 3

    .line 437
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_8

    const/4 p0, 0x1

    return p0

    .line 438
    :cond_8
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_11

    iget-boolean p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_nameCopied:Z

    return p0

    :cond_11
    const/4 p0, 0x0

    return p0
.end method

.method public isNaN()Z
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 603
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserMinimalBase;->_currToken:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_17

    .line 604
    iget v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_17

    .line 605
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_getNumberDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isFinite(D)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0

    :cond_17
    const/4 p0, 0x0

    return p0
.end method

.method public overrideStdFeatures(II)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 4

    .line 316
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    and-int/2addr p1, p2

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    xor-int p2, v0, p1

    if-eqz p2, :cond_f

    .line 320
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    .line 321
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/core/base/ParserBase;->_checkStdFeatureChanges(II)V

    :cond_f
    return-object p0
.end method

.method protected reportInvalidBase64Char(Lcom/fasterxml/jackson/core/Base64Variant;II)Ljava/lang/IllegalArgumentException;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1474
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->reportInvalidBase64Char(Lcom/fasterxml/jackson/core/Base64Variant;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;

    move-result-object p0

    return-object p0
.end method

.method protected reportInvalidBase64Char(Lcom/fasterxml/jackson/core/Base64Variant;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    const/16 p0, 0x20

    if-gt p2, p0, :cond_19

    .line 1485
    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    add-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    .line 1484
    const-string p1, "Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_83

    .line 1486
    :cond_19
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPaddingChar(I)Z

    move-result p0

    if-eqz p0, :cond_41

    .line 1487
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "Unexpected padding character (\'"

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/Base64Variant;->getPaddingChar()C

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, "\') as character #"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of 4-char base64 unit: padding only legal as 3rd or 4th character"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_83

    .line 1488
    :cond_41
    invoke-static {p2}, Ljava/lang/Character;->isDefined(I)Z

    move-result p0

    const-string p1, ") in base64 content"

    if-eqz p0, :cond_6e

    invoke-static {p2}, Ljava/lang/Character;->isISOControl(I)Z

    move-result p0

    if-nez p0, :cond_6e

    .line 1492
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p3, "Illegal character \'"

    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char p3, p2

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p3, "\' (code 0x"

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_83

    .line 1490
    :cond_6e
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p3, "Illegal character (code 0x"

    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_83
    if-eqz p4, :cond_99

    .line 1495
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1497
    :cond_99
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method protected final resetAsNaN(Ljava/lang/String;D)Lcom/fasterxml/jackson/core/JsonToken;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 595
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_textBuffer:Lcom/fasterxml/jackson/core/util/TextBuffer;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->resetWithString(Ljava/lang/String;)V

    .line 596
    iput-wide p2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberDouble:D

    const/16 p1, 0x8

    .line 597
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    .line 598
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0
.end method

.method protected final resetFloat(ZIII)Lcom/fasterxml/jackson/core/JsonToken;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 583
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    add-int v1, p2, p3

    add-int/2addr v1, p4

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->validateFPLength(I)V

    .line 584
    iput-boolean p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberNegative:Z

    .line 585
    iput p2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_intLength:I

    .line 586
    iput p3, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_fractLength:I

    .line 587
    iput p4, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_expLength:I

    const/4 p1, 0x0

    .line 588
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    .line 589
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0
.end method

.method protected final resetInt(ZI)Lcom/fasterxml/jackson/core/JsonToken;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 570
    iget-object v0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->validateIntegerLength(I)V

    .line 571
    iput-boolean p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numberNegative:Z

    .line 572
    iput p2, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_intLength:I

    const/4 p1, 0x0

    .line 573
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_fractLength:I

    .line 574
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_expLength:I

    .line 575
    iput p1, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_numTypesValid:I

    .line 576
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0
.end method

.method public setCurrentValue(Ljava/lang/Object;)V
    .registers 2

    .line 274
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_parsingContext:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonStreamContext;->setCurrentValue(Ljava/lang/Object;)V

    return-void
.end method

.method public setFeatureMask(I)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 306
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    xor-int/2addr v0, p1

    if-eqz v0, :cond_a

    .line 308
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    .line 309
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/base/ParserBase;->_checkStdFeatureChanges(II)V

    :cond_a
    return-object p0
.end method

.method public streamReadConstraints()Lcom/fasterxml/jackson/core/StreamReadConstraints;
    .registers 1

    .line 855
    iget-object p0, p0, Lcom/fasterxml/jackson/core/base/ParserBase;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    return-object p0
.end method
