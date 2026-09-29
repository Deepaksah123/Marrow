###### Class com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer (com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer)
.class public Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/StdScalarDeserializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/deser/std/StdScalarDeserializer<",
        "Ljava/lang/StackTraceElement;",
        ">;"
    }
.end annotation


# instance fields
.field protected final _adapterDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;-><init>(Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/JsonDeserializer;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;)V"
        }
    .end annotation

    .line 27
    const-class v0, Ljava/lang/StackTraceElement;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/StdScalarDeserializer;-><init>(Ljava/lang/Class;)V

    .line 28
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;->_adapterDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    return-void
.end method

.method public static construct(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    if-nez p0, :cond_8

    .line 37
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;-><init>()V

    return-object p0

    .line 39
    :cond_8
    const-class v0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findNonContextualValueDeserializer(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    .line 40
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;-><init>(Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    return-object v0
.end method


# virtual methods
.method protected constructValue(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;)Ljava/lang/StackTraceElement;
    .registers 12

    .line 75
    iget-object v2, p2, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->className:Ljava/lang/String;

    iget-object v3, p2, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->methodName:Ljava/lang/String;

    iget-object v4, p2, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->fileName:Ljava/lang/String;

    iget v5, p2, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->lineNumber:I

    iget-object v6, p2, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->moduleName:Ljava/lang/String;

    iget-object v7, p2, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->moduleVersion:Ljava/lang/String;

    iget-object v8, p2, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->classLoaderName:Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v8}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;->constructValue(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StackTraceElement;

    move-result-object p0

    return-object p0
.end method

.method protected constructValue(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StackTraceElement;
    .registers 9

    .line 100
    new-instance p0, Ljava/lang/StackTraceElement;

    invoke-direct {p0, p2, p3, p4, p5}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object p0
.end method

.method public bridge synthetic deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JacksonException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/StackTraceElement;

    move-result-object p0

    return-object p0
.end method

.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/StackTraceElement;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 46
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->currentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    .line 49
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_34

    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v1, :cond_34

    .line 58
    sget-object v1, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-ne v0, v1, :cond_2b

    sget-object v0, Lcom/fasterxml/jackson/databind/DeserializationFeature;->UNWRAP_SINGLE_VALUE_ARRAYS:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->isEnabled(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 59
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 60
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 61
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v1

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v1, v2, :cond_2a

    .line 62
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;->handleMissingEndArrayForSingle(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)V

    :cond_2a
    return-object v0

    .line 66
    :cond_2b
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;->_valueClass:Ljava/lang/Class;

    invoke-virtual {p2, p0, p1}, Lcom/fasterxml/jackson/databind/DeserializationContext;->handleUnexpectedToken(Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonParser;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/StackTraceElement;

    return-object p0

    .line 52
    :cond_34
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;->_adapterDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-nez v0, :cond_41

    .line 53
    const-class v0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;

    invoke-virtual {p2, p1, v0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->readValue(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;

    goto :goto_47

    .line 55
    :cond_41
    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;

    .line 57
    :goto_47
    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;->constructValue(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;)Ljava/lang/StackTraceElement;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer.Adapter (com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer$Adapter)
.class public final Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Adapter"
.end annotation


# instance fields
.field public classLoaderName:Ljava/lang/String;

.field public className:Ljava/lang/String;

.field public fileName:Ljava/lang/String;

.field public lineNumber:I

.field public methodName:Ljava/lang/String;

.field public moduleName:Ljava/lang/String;

.field public moduleVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    const-string v0, ""

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->className:Ljava/lang/String;

    .line 113
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->fileName:Ljava/lang/String;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->methodName:Ljava/lang/String;

    const/4 v0, -0x1

    .line 114
    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer$Adapter;->lineNumber:I

    return-void
.end method
