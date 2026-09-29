###### Class com.fasterxml.jackson.core.JsonParser (com.fasterxml.jackson.core.JsonParser)
.class public abstract Lcom/fasterxml/jackson/core/JsonParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/core/JsonParser$Feature;,
        Lcom/fasterxml/jackson/core/JsonParser$NumberType;
    }
.end annotation


# static fields
.field public static final DEFAULT_READ_CAPABILITIES:Lcom/fasterxml/jackson/core/util/JacksonFeatureSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/core/util/JacksonFeatureSet<",
            "Lcom/fasterxml/jackson/core/StreamReadCapability;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public _features:I

.field protected transient _requestPayload:Lcom/fasterxml/jackson/core/util/RequestPayload;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 52
    invoke-static {}, Lcom/fasterxml/jackson/core/StreamReadCapability;->values()[Lcom/fasterxml/jackson/core/StreamReadCapability;

    move-result-object v0

    invoke-static {v0}, Lcom/fasterxml/jackson/core/util/JacksonFeatureSet;->fromDefaults([Lcom/fasterxml/jackson/core/util/JacksonFeature;)Lcom/fasterxml/jackson/core/util/JacksonFeatureSet;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser;->DEFAULT_READ_CAPABILITIES:Lcom/fasterxml/jackson/core/util/JacksonFeatureSet;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 426
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 428
    sget v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_PARSER_FEATURE_FLAGS:I

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    .line 431
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    return-void
.end method


# virtual methods
.method protected _codec()Lcom/fasterxml/jackson/core/ObjectCodec;
    .registers 2

    .line 2455
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCodec()Lcom/fasterxml/jackson/core/ObjectCodec;

    move-result-object p0

    if-eqz p0, :cond_7

    return-object p0

    .line 2457
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "No ObjectCodec defined for parser, needed for deserialization"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected _constructError(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParseException;
    .registers 3

    .line 2477
    new-instance v0, Lcom/fasterxml/jackson/core/JsonParseException;

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/core/JsonParseException;-><init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonParser;->_requestPayload:Lcom/fasterxml/jackson/core/util/RequestPayload;

    .line 2478
    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/core/JsonParseException;->withRequestPayload(Lcom/fasterxml/jackson/core/util/RequestPayload;)Lcom/fasterxml/jackson/core/JsonParseException;

    move-result-object p0

    return-object p0
.end method

.method protected _reportUnsupportedOperation()V
    .registers 4

    .line 2488
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Operation not supported by parser of type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public canReadObjectId()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canReadTypeId()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public abstract clearCurrentToken()V
.end method

.method public abstract close()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public currentName()Ljava/lang/String;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1492
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public currentToken()Lcom/fasterxml/jackson/core/JsonToken;
    .registers 1

    .line 1256
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object p0

    return-object p0
.end method

.method public currentTokenId()I
    .registers 1

    .line 1273
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentTokenId()I

    move-result p0

    return p0
.end method

.method public abstract getBigIntegerValue()Ljava/math/BigInteger;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public getBinaryValue()[B
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1986
    invoke-static {}, Lcom/fasterxml/jackson/core/Base64Variants;->getDefaultVariant()Lcom/fasterxml/jackson/core/Base64Variant;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->getBinaryValue(Lcom/fasterxml/jackson/core/Base64Variant;)[B

    move-result-object p0

    return-object p0
.end method

.method public abstract getBinaryValue(Lcom/fasterxml/jackson/core/Base64Variant;)[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public getBooleanValue()Z
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1914
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 1915
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_a

    const/4 p0, 0x1

    return p0

    .line 1916
    :cond_a
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_10

    const/4 p0, 0x0

    return p0

    .line 1917
    :cond_10
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 1918
    new-instance v1, Lcom/fasterxml/jackson/core/JsonParseException;

    const-string v2, "Current token (%s) not of boolean type"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/fasterxml/jackson/core/JsonParseException;-><init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonParser;->_requestPayload:Lcom/fasterxml/jackson/core/util/RequestPayload;

    .line 1919
    invoke-virtual {v1, p0}, Lcom/fasterxml/jackson/core/JsonParseException;->withRequestPayload(Lcom/fasterxml/jackson/core/util/RequestPayload;)Lcom/fasterxml/jackson/core/JsonParseException;

    move-result-object p0

    throw p0
.end method

.method public getByteValue()B
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1735
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getIntValue()I

    move-result v0

    const/16 v1, -0x80

    if-lt v0, v1, :cond_e

    const/16 v1, 0xff

    if-gt v0, v1, :cond_e

    int-to-byte p0, v0

    return p0

    .line 1741
    :cond_e
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lcom/fasterxml/jackson/core/exc/InputCoercionException;

    const-string v2, "Numeric value (%s) out of range of Java byte"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-direct {v1, p0, v0, v2, v3}, Lcom/fasterxml/jackson/core/exc/InputCoercionException;-><init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;Ljava/lang/Class;)V

    throw v1
.end method

.method public abstract getCodec()Lcom/fasterxml/jackson/core/ObjectCodec;
.end method

.method public abstract getCurrentLocation()Lcom/fasterxml/jackson/core/JsonLocation;
.end method

.method public abstract getCurrentName()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;
.end method

.method public abstract getCurrentTokenId()I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getDecimalValue()Ljava/math/BigDecimal;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getDoubleValue()D
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public getEmbeddedObject()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract getFloatValue()F
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getIntValue()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getLongValue()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getNumberType()Lcom/fasterxml/jackson/core/JsonParser$NumberType;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getNumberValue()Ljava/lang/Number;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public getNumberValueDeferred()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1693
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getNumberValue()Ljava/lang/Number;

    move-result-object p0

    return-object p0
.end method

.method public getObjectId()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract getParsingContext()Lcom/fasterxml/jackson/core/JsonStreamContext;
.end method

.method public getReadCapabilities()Lcom/fasterxml/jackson/core/util/JacksonFeatureSet;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/core/util/JacksonFeatureSet<",
            "Lcom/fasterxml/jackson/core/StreamReadCapability;",
            ">;"
        }
    .end annotation

    .line 623
    sget-object p0, Lcom/fasterxml/jackson/core/JsonParser;->DEFAULT_READ_CAPABILITIES:Lcom/fasterxml/jackson/core/util/JacksonFeatureSet;

    return-object p0
.end method

.method public getShortValue()S
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1768
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getIntValue()I

    move-result v0

    const/16 v1, -0x8000

    if-lt v0, v1, :cond_e

    const/16 v1, 0x7fff

    if-gt v0, v1, :cond_e

    int-to-short p0, v0

    return p0

    .line 1771
    :cond_e
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lcom/fasterxml/jackson/core/exc/InputCoercionException;

    const-string v2, "Numeric value (%s) out of range of Java short"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-direct {v1, p0, v0, v2, v3}, Lcom/fasterxml/jackson/core/exc/InputCoercionException;-><init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonToken;Ljava/lang/Class;)V

    throw v1
.end method

.method public abstract getText()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getTextCharacters()[C
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getTextLength()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getTextOffset()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getTokenLocation()Lcom/fasterxml/jackson/core/JsonLocation;
.end method

.method public getTypeId()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p0, 0x0

    return-object p0
.end method

.method public getValueAsInt()I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 2053
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->getValueAsInt(I)I

    move-result p0

    return p0
.end method

.method public getValueAsInt(I)I
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return p1
.end method

.method public getValueAsLong()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    .line 2094
    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/JsonParser;->getValueAsLong(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getValueAsLong(J)J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-wide p1
.end method

.method public getValueAsString()Ljava/lang/String;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 2222
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonParser;->getValueAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public abstract getValueAsString(Ljava/lang/String;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract hasCurrentToken()Z
.end method

.method public abstract hasTextCharacters()Z
.end method

.method public abstract hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z
.end method

.method public abstract hasTokenId(I)Z
.end method

.method public isEnabled(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z
    .registers 2

    .line 917
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->enabledIn(I)Z

    move-result p0

    return p0
.end method

.method public isEnabled(Lcom/fasterxml/jackson/core/StreamReadFeature;)Z
    .registers 2

    .line 928
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/StreamReadFeature;->mappedFeature()Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-result-object p1

    iget p0, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    invoke-virtual {p1, p0}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->enabledIn(I)Z

    move-result p0

    return p0
.end method

.method public isExpectedNumberIntToken()Z
    .registers 2

    .line 1393
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object p0

    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne p0, v0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public isExpectedStartArrayToken()Z
    .registers 2

    .line 1366
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object p0

    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne p0, v0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public isExpectedStartObjectToken()Z
    .registers 2

    .line 1378
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object p0

    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne p0, v0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public isNaN()Z
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public nextFieldName()Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1091
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_d

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method

.method public nextTextValue()Ljava/lang/String;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1112
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_d

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract nextToken()Lcom/fasterxml/jackson/core/JsonToken;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public overrideFormatFeatures(II)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 3

    return-object p0
.end method

.method public overrideStdFeatures(II)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 4

    .line 973
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    and-int/2addr p1, p2

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    .line 974
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonParser;->setFeatureMask(I)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0
.end method

.method public readBinaryValue(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/OutputStream;)I
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2025
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->_reportUnsupportedOperation()V

    const/4 p0, 0x0

    return p0
.end method

.method public readValueAsTree()Lcom/fasterxml/jackson/core/TreeNode;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/fasterxml/jackson/core/TreeNode;",
            ">()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2451
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->_codec()Lcom/fasterxml/jackson/core/ObjectCodec;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/core/ObjectCodec;->readTree(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/TreeNode;

    move-result-object p0

    return-object p0
.end method

.method public requiresCustomCodec()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public setCurrentValue(Ljava/lang/Object;)V
    .registers 2

    .line 813
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getParsingContext()Lcom/fasterxml/jackson/core/JsonStreamContext;

    move-result-object p0

    if-eqz p0, :cond_9

    .line 815
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonStreamContext;->setCurrentValue(Ljava/lang/Object;)V

    :cond_9
    return-void
.end method

.method public setFeatureMask(I)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 951
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonParser;->_features:I

    return-object p0
.end method

.method public setSchema(Lcom/fasterxml/jackson/core/FormatSchema;)V
    .registers 4

    .line 540
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Parser of type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " does not support schema of type \'"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-interface {p1}, Lcom/fasterxml/jackson/core/FormatSchema;->getSchemaType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public abstract skipChildren()Lcom/fasterxml/jackson/core/JsonParser;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public streamReadConstraints()Lcom/fasterxml/jackson/core/StreamReadConstraints;
    .registers 1

    .line 516
    invoke-static {}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->defaults()Lcom/fasterxml/jackson/core/StreamReadConstraints;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.core.JsonParser.Feature (com.fasterxml.jackson.core.JsonParser$Feature)
.class public final enum Lcom/fasterxml/jackson/core/JsonParser$Feature;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/JsonParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Feature"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/core/JsonParser$Feature;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER:Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALLOW_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALLOW_MISSING_VALUES:Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALLOW_NON_NUMERIC_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALLOW_NUMERIC_LEADING_ZEROS:Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALLOW_SINGLE_QUOTES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum ALLOW_TRAILING_COMMA:Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALLOW_UNQUOTED_CONTROL_CHARS:Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALLOW_UNQUOTED_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum ALLOW_YAML_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum AUTO_CLOSE_SOURCE:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum IGNORE_UNDEFINED:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum INCLUDE_SOURCE_IN_LOCATION:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum STRICT_DUPLICATE_DETECTION:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum USE_FAST_BIG_NUMBER_PARSER:Lcom/fasterxml/jackson/core/JsonParser$Feature;

.field public static final enum USE_FAST_DOUBLE_PARSER:Lcom/fasterxml/jackson/core/JsonParser$Feature;


# instance fields
.field private final _defaultState:Z

.field private final _mask:I


# direct methods
.method static constructor <clinit>()V
    .registers 23

    .line 72
    new-instance v1, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v0, v1

    const-string v2, "AUTO_CLOSE_SOURCE"

    const/4 v15, 0x0

    const/4 v14, 0x1

    invoke-direct {v1, v2, v15, v14}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/fasterxml/jackson/core/JsonParser$Feature;->AUTO_CLOSE_SOURCE:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 91
    new-instance v2, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v1, v2

    const-string v3, "ALLOW_COMMENTS"

    invoke-direct {v2, v3, v14, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v2, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 108
    new-instance v3, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v2, v3

    const-string v4, "ALLOW_YAML_COMMENTS"

    const/4 v5, 0x2

    invoke-direct {v3, v4, v5, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_YAML_COMMENTS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 122
    new-instance v4, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v3, v4

    const-string v5, "ALLOW_UNQUOTED_FIELD_NAMES"

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v4, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_UNQUOTED_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 138
    new-instance v5, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v4, v5

    const-string v6, "ALLOW_SINGLE_QUOTES"

    const/4 v7, 0x4

    invoke-direct {v5, v6, v7, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v5, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_SINGLE_QUOTES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 153
    new-instance v6, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v5, v6

    const-string v7, "ALLOW_UNQUOTED_CONTROL_CHARS"

    const/4 v8, 0x5

    invoke-direct {v6, v7, v8, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v6, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_UNQUOTED_CONTROL_CHARS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 167
    new-instance v7, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v6, v7

    const-string v8, "ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER"

    const/4 v9, 0x6

    invoke-direct {v7, v8, v9, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v7, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 182
    new-instance v8, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v7, v8

    const-string v9, "ALLOW_NUMERIC_LEADING_ZEROS"

    const/4 v10, 0x7

    invoke-direct {v8, v9, v10, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v8, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_NUMERIC_LEADING_ZEROS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 188
    new-instance v9, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v8, v9

    const-string v10, "ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS"

    const/16 v11, 0x8

    invoke-direct {v9, v10, v11, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v9, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 194
    new-instance v10, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v9, v10

    const-string v11, "ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS"

    const/16 v12, 0x9

    invoke-direct {v10, v11, v12, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v10, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 200
    new-instance v11, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v10, v11

    const-string v12, "ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS"

    const/16 v13, 0xa

    invoke-direct {v11, v12, v13, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v11, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 223
    new-instance v12, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v11, v12

    const-string v13, "ALLOW_NON_NUMERIC_NUMBERS"

    const/16 v14, 0xb

    invoke-direct {v12, v13, v14, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v12, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_NON_NUMERIC_NUMBERS:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 244
    new-instance v13, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v12, v13

    const-string v14, "ALLOW_MISSING_VALUES"

    move-object/from16 v19, v0

    const/16 v0, 0xc

    invoke-direct {v13, v14, v0, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v13, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_MISSING_VALUES:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 270
    new-instance v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object v13, v0

    const-string v14, "ALLOW_TRAILING_COMMA"

    move-object/from16 v20, v1

    const/16 v1, 0xd

    invoke-direct {v0, v14, v1, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->ALLOW_TRAILING_COMMA:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 291
    new-instance v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    const/4 v1, 0x1

    move-object v14, v0

    const-string v1, "STRICT_DUPLICATE_DETECTION"

    move-object/from16 v21, v2

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2, v15}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->STRICT_DUPLICATE_DETECTION:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 315
    new-instance v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move v1, v15

    move-object v15, v0

    const-string v2, "IGNORE_UNDEFINED"

    move-object/from16 v22, v3

    const/16 v3, 0xf

    invoke-direct {v0, v2, v3, v1}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->IGNORE_UNDEFINED:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 338
    new-instance v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object/from16 v16, v0

    const-string v2, "INCLUDE_SOURCE_IN_LOCATION"

    const/16 v3, 0x10

    const/4 v1, 0x1

    invoke-direct {v0, v2, v3, v1}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->INCLUDE_SOURCE_IN_LOCATION:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 349
    new-instance v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object/from16 v17, v0

    const-string v1, "USE_FAST_DOUBLE_PARSER"

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->USE_FAST_DOUBLE_PARSER:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    .line 360
    new-instance v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object/from16 v18, v0

    const-string v1, "USE_FAST_BIG_NUMBER_PARSER"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2, v3}, Lcom/fasterxml/jackson/core/JsonParser$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->USE_FAST_BIG_NUMBER_PARSER:Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    move-object/from16 v3, v22

    .line 57
    filled-new-array/range {v0 .. v18}, [Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->$VALUES:[Lcom/fasterxml/jackson/core/JsonParser$Feature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 388
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x1

    .line 389
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    shl-int/2addr p1, p2

    iput p1, p0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->_mask:I

    .line 390
    iput-boolean p3, p0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->_defaultState:Z

    return-void
.end method

.method public static collectDefaults()I
    .registers 6

    .line 380
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->values()[Lcom/fasterxml/jackson/core/JsonParser$Feature;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_7
    if-ge v2, v1, :cond_19

    aget-object v4, v0, v2

    .line 381
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->enabledByDefault()Z

    move-result v5

    if-eqz v5, :cond_16

    .line 382
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->getMask()I

    move-result v4

    or-int/2addr v3, v4

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_19
    return v3
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .registers 2

    .line 57
    const-class v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/core/JsonParser$Feature;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/core/JsonParser$Feature;
    .registers 1

    .line 57
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->$VALUES:[Lcom/fasterxml/jackson/core/JsonParser$Feature;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/core/JsonParser$Feature;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/core/JsonParser$Feature;

    return-object v0
.end method


# virtual methods
.method public final enabledByDefault()Z
    .registers 1

    .line 393
    iget-boolean p0, p0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->_defaultState:Z

    return p0
.end method

.method public final enabledIn(I)Z
    .registers 2

    .line 395
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->_mask:I

    and-int/2addr p0, p1

    if-eqz p0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public final getMask()I
    .registers 1

    .line 397
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonParser$Feature;->_mask:I

    return p0
.end method

###### Class com.fasterxml.jackson.core.JsonParser.NumberType (com.fasterxml.jackson.core.JsonParser$NumberType)
.class public final enum Lcom/fasterxml/jackson/core/JsonParser$NumberType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/JsonParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NumberType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/core/JsonParser$NumberType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/core/JsonParser$NumberType;

.field public static final enum BIG_DECIMAL:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

.field public static final enum BIG_INTEGER:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

.field public static final enum DOUBLE:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

.field public static final enum FLOAT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

.field public static final enum INT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

.field public static final enum LONG:Lcom/fasterxml/jackson/core/JsonParser$NumberType;


# direct methods
.method static constructor <clinit>()V
    .registers 8

    .line 41
    new-instance v0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    const-string v1, "INT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/core/JsonParser$NumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->INT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    new-instance v1, Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    const-string v2, "LONG"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/core/JsonParser$NumberType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->LONG:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    new-instance v2, Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    const-string v3, "BIG_INTEGER"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/core/JsonParser$NumberType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->BIG_INTEGER:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    new-instance v3, Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    const-string v4, "FLOAT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/fasterxml/jackson/core/JsonParser$NumberType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->FLOAT:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    new-instance v4, Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    const-string v5, "DOUBLE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/fasterxml/jackson/core/JsonParser$NumberType;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->DOUBLE:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    new-instance v5, Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    const-string v6, "BIG_DECIMAL"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lcom/fasterxml/jackson/core/JsonParser$NumberType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->BIG_DECIMAL:Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    .line 40
    filled-new-array/range {v0 .. v5}, [Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->$VALUES:[Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser$NumberType;
    .registers 2

    .line 40
    const-class v0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/core/JsonParser$NumberType;
    .registers 1

    .line 40
    sget-object v0, Lcom/fasterxml/jackson/core/JsonParser$NumberType;->$VALUES:[Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/core/JsonParser$NumberType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/core/JsonParser$NumberType;

    return-object v0
.end method
