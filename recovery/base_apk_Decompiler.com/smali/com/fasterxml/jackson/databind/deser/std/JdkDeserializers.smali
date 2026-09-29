###### Class com.fasterxml.jackson.databind.deser.std.JdkDeserializers (com.fasterxml.jackson.databind.deser.std.JdkDeserializers)
.class public Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final _classNames:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 8

    .line 17
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers;->_classNames:Ljava/util/HashSet;

    .line 20
    const-class v1, Ljava/util/UUID;

    const-class v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const-class v3, Ljava/util/concurrent/atomic/AtomicInteger;

    const-class v4, Ljava/util/concurrent/atomic/AtomicLong;

    const-class v5, Ljava/lang/StackTraceElement;

    const-class v6, Ljava/nio/ByteBuffer;

    const-class v7, Ljava/lang/Void;

    filled-new-array/range {v1 .. v7}, [Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_1b
    const/4 v3, 0x7

    if-ge v2, v3, :cond_2c

    .line 29
    aget-object v3, v0, v2

    sget-object v4, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers;->_classNames:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1b

    .line 30
    :cond_2c
    invoke-static {}, Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;->types()[Ljava/lang/Class;

    move-result-object v0

    array-length v2, v0

    :goto_31
    if-ge v1, v2, :cond_41

    aget-object v3, v0, v1

    sget-object v4, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers;->_classNames:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_31

    :cond_41
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static find(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Class;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
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

    .line 50
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers;->_classNames:Ljava/util/HashSet;

    invoke-virtual {v0, p2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_51

    .line 51
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;->findDeserializer(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;

    move-result-object p2

    if-eqz p2, :cond_f

    return-object p2

    .line 55
    :cond_f
    const-class p2, Ljava/util/UUID;

    if-ne p1, p2, :cond_19

    .line 56
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/UUIDDeserializer;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/UUIDDeserializer;-><init>()V

    return-object p0

    .line 58
    :cond_19
    const-class p2, Ljava/lang/StackTraceElement;

    if-ne p1, p2, :cond_22

    .line 59
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer;->construct(Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0

    .line 61
    :cond_22
    const-class p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    if-ne p1, p0, :cond_2c

    .line 62
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/AtomicBooleanDeserializer;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/AtomicBooleanDeserializer;-><init>()V

    return-object p0

    .line 64
    :cond_2c
    const-class p0, Ljava/util/concurrent/atomic/AtomicInteger;

    if-ne p1, p0, :cond_36

    .line 65
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/AtomicIntegerDeserializer;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/AtomicIntegerDeserializer;-><init>()V

    return-object p0

    .line 67
    :cond_36
    const-class p0, Ljava/util/concurrent/atomic/AtomicLong;

    if-ne p1, p0, :cond_40

    .line 68
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/AtomicLongDeserializer;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/AtomicLongDeserializer;-><init>()V

    return-object p0

    .line 70
    :cond_40
    const-class p0, Ljava/nio/ByteBuffer;

    if-ne p1, p0, :cond_4a

    .line 71
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/ByteBufferDeserializer;

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/std/ByteBufferDeserializer;-><init>()V

    return-object p0

    .line 73
    :cond_4a
    const-class p0, Ljava/lang/Void;

    if-ne p1, p0, :cond_51

    .line 74
    sget-object p0, Lcom/fasterxml/jackson/databind/deser/std/NullifyingDeserializer;->instance:Lcom/fasterxml/jackson/databind/deser/std/NullifyingDeserializer;

    return-object p0

    :cond_51
    const/4 p0, 0x0

    return-object p0
.end method
