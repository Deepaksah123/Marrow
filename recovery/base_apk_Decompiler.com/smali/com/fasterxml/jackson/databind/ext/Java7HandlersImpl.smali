###### Class com.fasterxml.jackson.databind.ext.Java7HandlersImpl (com.fasterxml.jackson.databind.ext.Java7HandlersImpl)
.class public Lcom/fasterxml/jackson/databind/ext/Java7HandlersImpl;
.super Lcom/fasterxml/jackson/databind/ext/Java7Handlers;
.source "SourceFile"


# instance fields
.field private final _pathClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 17
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/ext/Java7Handlers;-><init>()V

    .line 20
    const-class v0, Ljava/nio/file/Path;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ext/Java7HandlersImpl;->_pathClass:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public getDeserializerForJavaNioFilePath(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;"
        }
    .end annotation

    .line 30
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ext/Java7HandlersImpl;->_pathClass:Ljava/lang/Class;

    if-ne p1, p0, :cond_a

    .line 31
    new-instance p0, Lcom/fasterxml/jackson/databind/ext/NioPathDeserializer;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/ext/NioPathDeserializer;-><init>()V

    return-object p0

    :cond_a
    const/4 p0, 0x0

    return-object p0
.end method

.method public getSerializerForJavaNioFilePath(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/JsonSerializer<",
            "*>;"
        }
    .end annotation

    .line 38
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ext/Java7HandlersImpl;->_pathClass:Ljava/lang/Class;

    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_e

    .line 39
    new-instance p0, Lcom/fasterxml/jackson/databind/ext/NioPathSerializer;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/ext/NioPathSerializer;-><init>()V

    return-object p0

    :cond_e
    const/4 p0, 0x0

    return-object p0
.end method
