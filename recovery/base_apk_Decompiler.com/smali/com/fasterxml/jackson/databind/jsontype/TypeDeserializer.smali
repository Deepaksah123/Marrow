###### Class com.fasterxml.jackson.databind.jsontype.TypeDeserializer (com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
.class public abstract Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static deserializeIfNatural(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 142
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;->deserializeIfNatural(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static deserializeIfNatural(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 149
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_8

    return-object v0

    .line 153
    :cond_8
    sget-object v1, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_57

    const/4 v1, 0x2

    if-eq p1, v1, :cond_46

    const/4 v1, 0x3

    if-eq p1, v1, :cond_35

    const/4 p0, 0x4

    if-eq p1, p0, :cond_2a

    const/4 p0, 0x5

    if-ne p1, p0, :cond_64

    .line 176
    const-class p0, Ljava/lang/Boolean;

    invoke-virtual {p2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_64

    .line 177
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 171
    :cond_2a
    const-class p0, Ljava/lang/Boolean;

    invoke-virtual {p2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_64

    .line 172
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    .line 166
    :cond_35
    const-class p1, Ljava/lang/Double;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_64

    .line 167
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getDoubleValue()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    .line 160
    :cond_46
    const-class p1, Ljava/lang/Integer;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_64

    .line 161
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getIntValue()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 155
    :cond_57
    const-class p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_64

    .line 156
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_64
    return-object v0
.end method


# virtual methods
.method public abstract deserializeTypedFromAny(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract deserializeTypedFromArray(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract deserializeTypedFromObject(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract deserializeTypedFromScalar(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract forProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;
.end method

.method public abstract getDefaultImpl()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract getPropertyName()Ljava/lang/String;
.end method

.method public abstract getTypeIdResolver()Lcom/fasterxml/jackson/databind/jsontype/TypeIdResolver;
.end method

.method public abstract getTypeInclusion()Lcom/fasterxml/jackson/annotation/JsonTypeInfo$As;
.end method

.method public hasDefaultImpl()Z
    .registers 1

    .line 77
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;->getDefaultImpl()Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

###### Class com.fasterxml.jackson.databind.jsontype.TypeDeserializer.AnonymousClass1 (com.fasterxml.jackson.databind.jsontype.TypeDeserializer$1)
.class synthetic Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$fasterxml$jackson$core$JsonToken:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 153
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonToken;->values()[Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    :try_start_9
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_STRING:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_12} :catch_12

    :catch_12
    :try_start_12
    sget-object v0, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_INT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1d
    sget-object v0, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NUMBER_FLOAT:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_28} :catch_28

    :catch_28
    :try_start_28
    sget-object v0, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_TRUE:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_33} :catch_33

    :catch_33
    :try_start_33
    sget-object v0, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer$1;->$SwitchMap$com$fasterxml$jackson$core$JsonToken:[I

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_FALSE:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_3e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_33 .. :try_end_3e} :catch_3e

    :catch_3e
    return-void
.end method
