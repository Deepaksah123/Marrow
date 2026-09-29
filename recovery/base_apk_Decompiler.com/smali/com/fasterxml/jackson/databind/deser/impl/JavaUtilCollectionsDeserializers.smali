###### Class com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers (com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers)
.class public abstract Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static _findSingletonTypeName(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 170
    const-string v0, "Singleton"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 v0, 0x9

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method private static _findSyncTypeName(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 174
    const-string v0, "Synchronized"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method private static _findUnmodifiableTypeName(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 178
    const-string v0, "Unmodifiable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method private static _findUtilArrayTypeName(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 149
    const-string v0, "java.util.Arrays$"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 v0, 0x11

    .line 150
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method private static _findUtilCollectionsImmutableTypeName(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 163
    const-string v0, "java.util.ImmutableCollections$"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 v0, 0x1f

    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method private static _findUtilCollectionsTypeName(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 156
    const-string v0, "java.util.Collections$"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 v0, 0x16

    .line 157
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method static converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;"
        }
    .end annotation

    .line 145
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/databind/JavaType;->findSuperType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;-><init>(ILcom/fasterxml/jackson/databind/JavaType;)V

    return-object v0
.end method

.method public static findForCollection(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
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

    .line 45
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 46
    const-string v0, "java.util."

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_12

    return-object v1

    .line 51
    :cond_12
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findUtilCollectionsTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x4

    .line 52
    const-string v3, "Set"

    const-string v4, "List"

    if-eqz v0, :cond_9e

    .line 56
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findUnmodifiableTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3e

    .line 57
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 58
    const-class p0, Ljava/util/Set;

    invoke-static {v2, p1, p0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_95

    .line 59
    :cond_30
    invoke-virtual {p0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_94

    const/4 p0, 0x5

    .line 60
    const-class v0, Ljava/util/List;

    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_95

    .line 62
    :cond_3e
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findSingletonTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_60

    .line 63
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_52

    const/4 p0, 0x1

    .line 64
    const-class v0, Ljava/util/Set;

    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_95

    .line 65
    :cond_52
    invoke-virtual {p0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_94

    const/4 p0, 0x2

    .line 66
    const-class v0, Ljava/util/List;

    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_95

    .line 68
    :cond_60
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findSyncTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_94

    .line 70
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_74

    const/4 p0, 0x7

    .line 71
    const-class v0, Ljava/util/Set;

    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_95

    .line 72
    :cond_74
    invoke-virtual {p0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_83

    const/16 p0, 0x9

    .line 73
    const-class v0, Ljava/util/List;

    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_95

    .line 74
    :cond_83
    const-string v0, "Collection"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_94

    const/16 p0, 0x8

    .line 75
    const-class v0, Ljava/util/Collection;

    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_95

    :cond_94
    move-object p0, v1

    :goto_95
    if-nez p0, :cond_98

    return-object v1

    .line 79
    :cond_98
    new-instance p1, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;-><init>(Lcom/fasterxml/jackson/databind/util/Converter;)V

    return-object p1

    .line 81
    :cond_9e
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findUtilArrayTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v5, 0xb

    if-eqz v0, :cond_b9

    .line 83
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_b8

    .line 88
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;

    const-class v0, Ljava/util/List;

    invoke-static {v5, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;-><init>(Lcom/fasterxml/jackson/databind/util/Converter;)V

    return-object p0

    :cond_b8
    return-object v1

    .line 93
    :cond_b9
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findUtilCollectionsImmutableTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_e3

    .line 95
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d1

    .line 97
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;

    const-class v0, Ljava/util/List;

    invoke-static {v5, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;-><init>(Lcom/fasterxml/jackson/databind/util/Converter;)V

    return-object p0

    .line 99
    :cond_d1
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_e3

    .line 101
    new-instance p0, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;

    const-class v0, Ljava/util/Set;

    invoke-static {v2, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;-><init>(Lcom/fasterxml/jackson/databind/util/Converter;)V

    return-object p0

    :cond_e3
    return-object v1
.end method

.method public static findForMap(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
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

    .line 113
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 117
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findUtilCollectionsTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    const-string v3, "Map"

    if-eqz v0, :cond_4e

    .line 120
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findUnmodifiableTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_25

    .line 121
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_61

    .line 122
    const-class p0, Ljava/util/Map;

    invoke-static {v1, p1, p0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_62

    .line 124
    :cond_25
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findSingletonTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_39

    .line 125
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_61

    const/4 p0, 0x3

    .line 126
    const-class v0, Ljava/util/Map;

    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_62

    .line 128
    :cond_39
    invoke-static {v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findSyncTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_61

    .line 130
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_61

    const/16 p0, 0xa

    .line 131
    const-class v0, Ljava/util/Map;

    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_62

    .line 134
    :cond_4e
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->_findUtilCollectionsImmutableTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_61

    .line 135
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_61

    .line 136
    const-class p0, Ljava/util/Map;

    invoke-static {v1, p1, p0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;->converter(ILcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;

    move-result-object p0

    goto :goto_62

    :cond_61
    move-object p0, v2

    :goto_62
    if-nez p0, :cond_65

    return-object v2

    .line 139
    :cond_65
    new-instance p1, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer;-><init>(Lcom/fasterxml/jackson/databind/util/Converter;)V

    return-object p1
.end method

###### Class com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter (com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter)
.class Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/databind/util/Converter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "JavaUtilCollectionsConverter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/fasterxml/jackson/databind/util/Converter<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final _inputType:Lcom/fasterxml/jackson/databind/JavaType;

.field private final _kind:I


# direct methods
.method constructor <init>(ILcom/fasterxml/jackson/databind/JavaType;)V
    .registers 3

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;->_inputType:Lcom/fasterxml/jackson/databind/JavaType;

    .line 194
    iput p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;->_kind:I

    return-void
.end method

.method private _checkSingleton(I)V
    .registers 4

    const/4 p0, 0x1

    if-ne p1, p0, :cond_4

    return-void

    .line 261
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can not deserialize Singleton container from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " entries"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    if-nez p1, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 203
    :cond_4
    iget v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;->_kind:I

    packed-switch v0, :pswitch_data_88

    return-object p1

    .line 238
    :pswitch_a
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 234
    :pswitch_11
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 236
    :pswitch_18
    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Ljava/util/Collections;->synchronizedCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    return-object p0

    .line 232
    :pswitch_1f
    check-cast p1, Ljava/util/Set;

    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 229
    :pswitch_26
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 227
    :pswitch_2d
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 225
    :pswitch_34
    check-cast p1, Ljava/util/Set;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 218
    :pswitch_3b
    check-cast p1, Ljava/util/Map;

    .line 219
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;->_checkSingleton(I)V

    .line 220
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    .line 221
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 212
    :pswitch_5f
    check-cast p1, Ljava/util/List;

    .line 213
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;->_checkSingleton(I)V

    const/4 p0, 0x0

    .line 214
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 206
    :pswitch_72
    check-cast p1, Ljava/util/Set;

    .line 207
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;->_checkSingleton(I)V

    .line 208
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :pswitch_data_88
    .packed-switch 0x1
        :pswitch_72
        :pswitch_5f
        :pswitch_3b
        :pswitch_34
        :pswitch_2d
        :pswitch_26
        :pswitch_1f
        :pswitch_18
        :pswitch_11
        :pswitch_a
    .end packed-switch
.end method

.method public getInputType(Lcom/fasterxml/jackson/databind/type/TypeFactory;)Lcom/fasterxml/jackson/databind/JavaType;
    .registers 2

    .line 249
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;->_inputType:Lcom/fasterxml/jackson/databind/JavaType;

    return-object p0
.end method

.method public getOutputType(Lcom/fasterxml/jackson/databind/type/TypeFactory;)Lcom/fasterxml/jackson/databind/JavaType;
    .registers 2

    .line 255
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/impl/JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter;->_inputType:Lcom/fasterxml/jackson/databind/JavaType;

    return-object p0
.end method
