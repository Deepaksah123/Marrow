###### Class com.fasterxml.jackson.databind.jdk14.JDK14Util (com.fasterxml.jackson.databind.jdk14.JDK14Util)
.class public Lcom/fasterxml/jackson/databind/jdk14/JDK14Util;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;,
        Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;,
        Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static findRecordConstructor(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Ljava/util/List;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;

    invoke-direct {v0, p0, p1, p2}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;-><init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)V

    .line 40
    invoke-virtual {v0, p3}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->locate(Ljava/util/List;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    move-result-object p0

    return-object p0
.end method

.method public static getRecordFieldNames(Ljava/lang/Class;)[Ljava/lang/String;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 29
    invoke-static {}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->instance()Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->getRecordFieldNames(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.jdk14.JDK14Util.CreatorLocator (com.fasterxml.jackson.databind.jdk14.JDK14Util$CreatorLocator)
.class Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/jdk14/JDK14Util;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CreatorLocator"
.end annotation


# instance fields
.field protected final _config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;"
        }
    .end annotation
.end field

.field protected final _constructors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;",
            ">;"
        }
    .end annotation
.end field

.field protected final _intr:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

.field protected final _primaryConstructor:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

.field protected final _recordClass:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

.field protected final _recordFields:[Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;


# direct methods
.method constructor <init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;",
            "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;",
            "Lcom/fasterxml/jackson/databind/cfg/MapperConfig<",
            "*>;)V"
        }
    .end annotation

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 169
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_recordClass:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    .line 171
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_intr:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    .line 172
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    .line 174
    invoke-static {}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->instance()Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;

    move-result-object p2

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getRawType()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->getRecordFields(Ljava/lang/Class;)[Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;

    move-result-object p2

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_recordFields:[Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;

    const/4 p3, 0x0

    if-nez p2, :cond_23

    .line 177
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getConstructors()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_constructors:Ljava/util/List;

    .line 178
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_primaryConstructor:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    return-void

    .line 180
    :cond_23
    array-length p2, p2

    if-nez p2, :cond_31

    .line 188
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getDefaultConstructor()Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    move-result-object p3

    .line 189
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_constructors:Ljava/util/List;

    goto :goto_64

    .line 191
    :cond_31
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;->getConstructors()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_constructors:Ljava/util/List;

    .line 193
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_64

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 194
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getParameterCount()I

    move-result v1

    if-ne v1, p2, :cond_3b

    const/4 v1, 0x0

    :goto_4e
    if-ge v1, p2, :cond_63

    .line 198
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;->getRawParameterType(I)Ljava/lang/Class;

    move-result-object v2

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_recordFields:[Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->rawType:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3b

    add-int/lit8 v1, v1, 0x1

    goto :goto_4e

    :cond_63
    move-object p3, v0

    :cond_64
    :goto_64
    if-eqz p3, :cond_69

    .line 210
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_primaryConstructor:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    return-void

    .line 207
    :cond_69
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Failed to find the canonical Record constructor of type "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_recordClass:Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;

    .line 208
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/Annotated;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    invoke-static {p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->getTypeDescription(Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public locate(Ljava/util/List;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;"
        }
    .end annotation

    .line 219
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_constructors:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    .line 220
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_intr:Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_config:Lcom/fasterxml/jackson/databind/cfg/MapperConfig;

    invoke-virtual {v3, v4, v1}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findCreatorAnnotation(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 221
    sget-object v4, Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DISABLED:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    if-eq v4, v3, :cond_6

    .line 225
    sget-object v4, Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DELEGATING:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;

    if-ne v4, v3, :cond_26

    return-object v2

    .line 228
    :cond_26
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_primaryConstructor:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    if-eq v1, v3, :cond_6

    return-object v2

    .line 233
    :cond_2b
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_recordFields:[Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;

    if-nez v0, :cond_30

    return-object v2

    .line 240
    :cond_30
    array-length v1, v0

    const/4 v2, 0x0

    :goto_32
    if-ge v2, v1, :cond_3e

    aget-object v3, v0, v2

    .line 241
    iget-object v3, v3, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->name:Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_32

    .line 243
    :cond_3e
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$CreatorLocator;->_primaryConstructor:Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.jdk14.JDK14Util.RawTypeName (com.fasterxml.jackson.databind.jdk14.JDK14Util$RawTypeName)
.class public Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/jdk14/JDK14Util;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RawTypeName"
.end annotation


# static fields
.field private static final $$a:[B

.field private static final $$b:I

.field private static IconCompatParcelizer:I

.field private static RemoteActionCompatParcelizer:I


# instance fields
.field public final name:Ljava/lang/String;

.field public final rawType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_14

    sput-object v0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->$$a:[B

    const/16 v0, 0xf9

    sput v0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->$$b:I

    const/4 v0, 0x0

    .line 156
    sput v0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    const/4 v0, 0x1

    sput v0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    return-void

    :array_14
    .array-data 1
        0x12t
        -0x7ft
        -0x4dt
        -0x69t
        -0x13t
        -0xat
        -0x3t
        0x14t
        -0x6t
        0x5t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->rawType:Ljava/lang/Class;

    .line 154
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->name:Ljava/lang/String;

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(III)[Ljava/lang/Object;
    .registers 41

    move/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    const/4 v3, 0x2

    .line 155
    rem-int v4, v3, v3

    sget v4, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    and-int/lit8 v5, v4, 0x4b

    or-int/lit8 v4, v4, 0x4b

    add-int/2addr v5, v4

    rem-int/lit16 v4, v5, 0x80

    sput v4, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    rem-int/2addr v5, v3

    const v4, 0x7f5446ba

    :try_start_18
    invoke-static {v4}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v4
    :try_end_1c
    .catchall {:try_start_18 .. :try_end_1c} :catchall_81d

    const-string v5, ""

    const-wide/16 v6, 0x0

    const/16 v8, 0x30

    const/16 v9, 0x10

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-nez v4, :cond_5e

    :try_start_28
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v4

    shr-int/2addr v4, v9

    int-to-char v12, v4

    invoke-static {v5, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v4

    rsub-int v13, v4, 0x5df

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v14

    cmp-long v4, v14, v6

    rsub-int/lit8 v14, v4, 0x16

    const v15, 0x11d822f

    const/16 v16, 0x0

    sget v4, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->$$b:I

    and-int/lit8 v4, v4, 0x7

    int-to-byte v4, v4

    neg-int v9, v4

    int-to-byte v9, v9

    add-int/lit8 v6, v9, 0x1

    int-to-byte v6, v6

    new-array v7, v10, [Ljava/lang/Object;

    invoke-static {v4, v9, v6, v7}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->a(BBI[Ljava/lang/Object;)V

    aget-object v4, v7, v11

    move-object/from16 v17, v4

    check-cast v17, Ljava/lang/String;

    new-array v4, v11, [Ljava/lang/Class;

    move-object/from16 v18, v4

    invoke-static/range {v12 .. v18}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    :cond_5e
    check-cast v4, Ljava/lang/reflect/Method;

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v12
    :try_end_6b
    .catchall {:try_start_28 .. :try_end_6b} :catchall_81d

    const v4, 0x548b4ed

    int-to-long v14, v4

    const/16 v4, -0x6d

    int-to-long v6, v4

    mul-long/2addr v6, v14

    const/16 v4, 0x6f

    int-to-long v8, v4

    mul-long/2addr v8, v12

    add-long/2addr v6, v8

    const/16 v4, -0xdc

    int-to-long v8, v4

    const/4 v4, -0x1

    int-to-long v10, v4

    xor-long v21, v14, v10

    move-object/from16 v23, v5

    int-to-long v4, v0

    or-long v25, v12, v4

    xor-long v25, v25, v10

    or-long v27, v21, v25

    mul-long v8, v8, v27

    add-long/2addr v6, v8

    const/16 v8, 0xdc

    int-to-long v8, v8

    or-long v27, v14, v12

    xor-long v27, v27, v10

    or-long v25, v27, v25

    mul-long v8, v8, v25

    add-long/2addr v6, v8

    const/16 v8, 0x6e

    int-to-long v8, v8

    or-long v21, v21, v12

    xor-long v21, v21, v10

    xor-long/2addr v12, v10

    or-long/2addr v12, v14

    xor-long/2addr v12, v10

    or-long v12, v21, v12

    mul-long/2addr v8, v12

    add-long/2addr v6, v8

    const v8, -0x210f427f

    int-to-long v8, v8

    add-long/2addr v6, v8

    const/16 v8, 0x20

    shr-long v12, v6, v8

    long-to-int v9, v12

    new-instance v12, Ljava/util/Random;

    invoke-direct {v12}, Ljava/util/Random;-><init>()V

    const v13, 0x714634da

    invoke-virtual {v12, v13}, Ljava/util/Random;->nextInt(I)I

    move-result v12

    not-int v12, v12

    const v13, -0x5998b02e

    or-int/2addr v12, v13

    mul-int/lit16 v13, v12, 0x1ef

    const v14, -0x25ede597

    add-int/2addr v14, v13

    const v13, -0x59bcfa30

    not-int v12, v12

    or-int/2addr v12, v13

    mul-int/lit16 v12, v12, 0x1ef

    add-int/2addr v14, v12

    and-int/2addr v9, v14

    long-to-int v6, v6

    const v7, -0x100156

    or-int v12, v7, v0

    not-int v12, v12

    const v13, 0x50418400

    or-int/2addr v12, v13

    mul-int/lit16 v12, v12, 0x1c1

    const v14, 0x8724c40

    add-int/2addr v12, v14

    not-int v14, v0

    or-int/2addr v7, v14

    not-int v7, v7

    or-int/2addr v7, v13

    mul-int/lit16 v7, v7, 0x1c1

    add-int/2addr v12, v7

    and-int/2addr v6, v12

    xor-int v7, v9, v6

    and-int/2addr v6, v9

    or-int/2addr v6, v7

    if-eqz v6, :cond_101

    sget v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    xor-int/lit8 v7, v6, 0x37

    and-int/lit8 v6, v6, 0x37

    const/16 v18, 0x1

    shl-int/lit8 v6, v6, 0x1

    add-int/2addr v7, v6

    rem-int/lit16 v6, v7, 0x80

    sput v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    rem-int/2addr v7, v3

    move/from16 v6, v18

    goto :goto_112

    :cond_101
    const/16 v18, 0x1

    sget v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    or-int/lit8 v7, v6, 0x2b

    shl-int/lit8 v7, v7, 0x1

    xor-int/lit8 v6, v6, 0x2b

    sub-int/2addr v7, v6

    rem-int/lit16 v6, v7, 0x80

    sput v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    rem-int/2addr v7, v3

    const/4 v6, 0x0

    :goto_112
    xor-int/lit16 v7, v0, 0x108

    neg-int v9, v6

    xor-int v12, v6, v9

    and-int/2addr v6, v9

    or-int/2addr v6, v12

    const/16 v12, 0x1f

    shr-int/2addr v6, v12

    not-int v9, v6

    and-int/2addr v9, v0

    and-int/2addr v6, v7

    xor-int v7, v9, v6

    and-int/2addr v6, v9

    or-int/2addr v6, v7

    const v7, 0x71b37006

    :try_start_126
    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v7

    const/4 v13, 0x0

    if-nez v7, :cond_174

    move-object/from16 v9, v23

    const/4 v12, 0x0

    const/16 v15, 0x30

    invoke-static {v9, v15, v12, v12}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v7

    const/4 v9, -0x1

    rsub-int/lit8 v7, v7, -0x1

    int-to-char v7, v7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v22

    const-wide/16 v19, 0x0

    cmp-long v9, v22, v19

    add-int/lit16 v9, v9, 0x1015

    invoke-static {v12, v13, v13}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v15

    cmpl-float v12, v15, v13

    rsub-int/lit8 v24, v12, 0x29

    const v25, 0xffab493

    const/16 v26, 0x0

    sget v12, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->$$b:I

    and-int/lit8 v12, v12, 0x7

    int-to-byte v12, v12

    neg-int v15, v12

    int-to-byte v15, v15

    add-int/lit8 v13, v15, 0x1

    int-to-byte v13, v13

    const/4 v3, 0x1

    new-array v8, v3, [Ljava/lang/Object;

    invoke-static {v12, v15, v13, v8}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->a(BBI[Ljava/lang/Object;)V

    const/4 v3, 0x0

    aget-object v8, v8, v3

    move-object/from16 v27, v8

    check-cast v27, Ljava/lang/String;

    new-array v8, v3, [Ljava/lang/Class;

    move/from16 v22, v7

    move/from16 v23, v9

    move-object/from16 v28, v8

    invoke-static/range {v22 .. v28}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    :cond_174
    check-cast v7, Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    invoke-virtual {v7, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7
    :try_end_181
    .catchall {:try_start_126 .. :try_end_181} :catchall_81d

    const v3, 0x622dd673

    int-to-long v12, v3

    const/16 v3, 0x8d

    move-wide/from16 v22, v10

    int-to-long v9, v3

    mul-long/2addr v9, v12

    const/16 v3, -0x117

    int-to-long v2, v3

    mul-long/2addr v2, v7

    add-long/2addr v9, v2

    const/16 v2, 0x8c

    int-to-long v2, v2

    or-long v24, v7, v4

    mul-long v24, v24, v2

    add-long v9, v9, v24

    const/16 v11, -0x118

    move/from16 v24, v14

    int-to-long v14, v11

    xor-long v25, v12, v22

    or-long v25, v25, v7

    xor-long v27, v25, v22

    xor-long v29, v4, v22

    or-long v31, v29, v7

    xor-long v31, v31, v22

    or-long v27, v27, v31

    mul-long v14, v14, v27

    add-long/2addr v9, v14

    xor-long v7, v7, v22

    or-long/2addr v7, v12

    xor-long v7, v7, v22

    or-long v11, v29, v12

    xor-long v11, v11, v22

    or-long/2addr v7, v11

    or-long v11, v25, v4

    xor-long v11, v11, v22

    or-long/2addr v7, v11

    mul-long/2addr v2, v7

    add-long/2addr v9, v2

    const v2, 0x13d6a787

    int-to-long v2, v2

    add-long/2addr v9, v2

    const/16 v2, 0x20

    shr-long v7, v9, v2

    long-to-int v2, v7

    const v3, -0x18e2bede

    or-int v7, v3, v0

    not-int v7, v7

    const v8, 0x24252810

    or-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x106

    const v8, 0x275ff1c

    add-int/2addr v7, v8

    or-int v3, v3, v24

    not-int v3, v3

    const v8, 0x24252810

    or-int/2addr v3, v8

    mul-int/lit16 v3, v3, 0x106

    add-int/2addr v7, v3

    and-int/2addr v2, v7

    long-to-int v3, v9

    const v7, -0x5559ff00

    or-int v7, v24, v7

    mul-int/lit16 v7, v7, 0x52c

    const v8, 0x30cf3287

    add-int/2addr v8, v7

    const v7, -0x5458f6bc

    or-int/2addr v7, v0

    not-int v7, v7

    const v9, -0x1515eef

    or-int/2addr v9, v0

    not-int v9, v9

    or-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0x52c

    add-int/2addr v8, v7

    const v7, -0x1906b432

    add-int/2addr v8, v7

    and-int/2addr v3, v8

    or-int/2addr v2, v3

    const/4 v3, 0x4

    if-eqz v2, :cond_230

    sget v2, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    xor-int/lit8 v7, v2, 0x6d

    and-int/lit8 v8, v2, 0x6d

    const/4 v9, 0x1

    shl-int/2addr v8, v9

    add-int/2addr v7, v8

    rem-int/lit16 v8, v7, 0x80

    sput v8, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    const/4 v8, 0x2

    rem-int/2addr v7, v8

    and-int/lit16 v7, v0, -0x11a

    move/from16 v8, v24

    and-int/lit16 v9, v8, 0x119

    or-int/2addr v7, v9

    or-int/lit8 v9, v2, 0x33

    const/4 v10, 0x1

    shl-int/2addr v9, v10

    xor-int/lit8 v2, v2, 0x33

    sub-int/2addr v9, v2

    rem-int/lit16 v2, v9, 0x80

    sput v2, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    const/4 v2, 0x2

    rem-int/2addr v9, v2

    if-eqz v9, :cond_233

    div-int/lit8 v2, v3, 0x5

    goto :goto_233

    :cond_230
    move/from16 v8, v24

    move v7, v0

    :cond_233
    :goto_233
    not-int v2, v6

    and-int/2addr v2, v0

    and-int v9, v6, v8

    or-int/2addr v2, v9

    sget v9, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    and-int/lit8 v10, v9, 0x11

    or-int/lit8 v9, v9, 0x11

    add-int/2addr v10, v9

    rem-int/lit16 v9, v10, 0x80

    sput v9, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    const/4 v11, 0x2

    rem-int/2addr v10, v11

    neg-int v10, v2

    xor-int v11, v2, v10

    and-int/2addr v2, v10

    or-int/2addr v2, v11

    const/16 v10, 0x1f

    shr-int/2addr v2, v10

    not-int v10, v2

    or-int/lit8 v11, v9, 0x6d

    const/4 v12, 0x1

    shl-int/2addr v11, v12

    xor-int/lit8 v9, v9, 0x6d

    sub-int/2addr v11, v9

    rem-int/lit16 v9, v11, 0x80

    sput v9, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    const/4 v9, 0x2

    rem-int/2addr v11, v9

    and-int/2addr v7, v10

    and-int/2addr v2, v6

    xor-int v6, v7, v2

    and-int/2addr v2, v7

    or-int/2addr v2, v6

    and-int/lit16 v6, v1, 0x4000

    if-nez v6, :cond_388

    const v6, -0x58eb5584

    :try_start_268
    invoke-static {v6}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_2a0

    const/4 v7, 0x0

    invoke-static {v7, v7}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v6

    int-to-char v9, v6

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v6

    const/4 v10, 0x0

    cmpl-float v6, v6, v10

    rsub-int v10, v6, 0xfb4

    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    move-result v6

    rsub-int/lit8 v11, v6, 0x13

    const v12, -0x26a29117

    int-to-byte v6, v7

    add-int/lit8 v14, v6, 0x2

    int-to-byte v14, v14

    add-int/lit8 v15, v14, -0x2

    int-to-byte v15, v15

    const/4 v3, 0x1

    new-array v13, v3, [Ljava/lang/Object;

    invoke-static {v6, v14, v15, v13}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->a(BBI[Ljava/lang/Object;)V

    aget-object v3, v13, v7

    move-object v14, v3

    check-cast v14, Ljava/lang/String;

    new-array v15, v7, [Ljava/lang/Class;

    const/4 v3, 0x0

    move v13, v3

    invoke-static/range {v9 .. v15}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    :cond_2a0
    check-cast v6, Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    invoke-virtual {v6, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6
    :try_end_2ad
    .catchall {:try_start_268 .. :try_end_2ad} :catchall_81d

    const v3, -0x2817feb7

    int-to-long v10, v3

    const/16 v3, -0x81

    int-to-long v12, v3

    mul-long/2addr v12, v10

    const/16 v3, 0x83

    int-to-long v14, v3

    mul-long/2addr v14, v6

    add-long/2addr v12, v14

    const/16 v3, 0x82

    int-to-long v14, v3

    xor-long v25, v6, v22

    or-long v27, v25, v29

    or-long v27, v27, v10

    xor-long v27, v27, v22

    mul-long v27, v27, v14

    add-long v12, v12, v27

    const/16 v3, -0x104

    move/from16 v17, v2

    int-to-long v1, v3

    or-long v25, v25, v10

    xor-long v27, v25, v22

    mul-long v1, v1, v27

    add-long/2addr v12, v1

    xor-long v1, v10, v22

    or-long/2addr v1, v6

    xor-long v1, v1, v22

    or-long v6, v25, v4

    xor-long v6, v6, v22

    or-long/2addr v1, v6

    mul-long/2addr v14, v1

    add-long/2addr v12, v14

    const v1, -0x143784dc

    int-to-long v1, v1

    add-long/2addr v12, v1

    const/16 v1, 0x20

    shr-long v2, v12, v1

    long-to-int v1, v2

    const v2, -0x3f4353c4

    or-int v3, v2, v8

    not-int v3, v3

    const v6, -0x166701e8

    or-int v7, v6, v0

    not-int v7, v7

    or-int/2addr v3, v7

    mul-int/lit16 v3, v3, 0xd9

    const v7, 0x1835b845

    add-int/2addr v7, v3

    or-int/2addr v2, v0

    not-int v2, v2

    const v3, 0x164301c3

    or-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0xd9

    add-int/2addr v7, v2

    or-int v2, v6, v8

    not-int v2, v2

    const v3, 0x3f4353c3

    or-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0xd9

    add-int/2addr v7, v2

    and-int/2addr v1, v7

    long-to-int v2, v12

    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    invoke-virtual {v3}, Ljava/util/Random;->nextInt()I

    move-result v3

    not-int v6, v3

    const v7, -0x667d6bb2

    or-int/2addr v7, v6

    not-int v7, v7

    const v10, 0x510201

    or-int/2addr v7, v10

    mul-int/lit8 v7, v7, -0x6c

    const v10, 0x73c5bee7

    add-int/2addr v10, v7

    const v7, -0x10d31608

    or-int/2addr v7, v3

    not-int v7, v7

    const v11, -0x76ff7fb8

    or-int/2addr v7, v11

    const v12, 0x10d31607

    or-int/2addr v6, v12

    not-int v6, v6

    or-int/2addr v6, v7

    mul-int/lit8 v6, v6, 0x36

    add-int/2addr v10, v6

    or-int/2addr v3, v11

    mul-int/lit8 v3, v3, 0x36

    add-int/2addr v10, v3

    and-int/2addr v2, v10

    xor-int v3, v1, v2

    and-int/2addr v1, v2

    or-int/2addr v1, v3

    and-int/lit16 v2, v0, 0x10c

    not-int v2, v2

    or-int/lit16 v3, v0, 0x10c

    and-int/2addr v2, v3

    neg-int v3, v1

    xor-int v6, v1, v3

    and-int/2addr v1, v3

    or-int/2addr v1, v6

    const/16 v3, 0x1f

    shr-int/2addr v1, v3

    sget v3, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    add-int/lit8 v3, v3, 0x11

    rem-int/lit16 v6, v3, 0x80

    sput v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    const/4 v7, 0x2

    rem-int/2addr v3, v7

    not-int v3, v1

    and-int/2addr v3, v0

    and-int/2addr v1, v2

    or-int/2addr v1, v3

    xor-int v2, v0, v17

    xor-int/lit8 v3, v6, 0x67

    and-int/lit8 v6, v6, 0x67

    const/4 v7, 0x1

    shl-int/2addr v6, v7

    add-int/2addr v3, v6

    rem-int/lit16 v6, v3, 0x80

    sput v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    const/4 v6, 0x2

    rem-int/2addr v3, v6

    if-nez v3, :cond_379

    neg-int v3, v2

    or-int/2addr v2, v3

    shr-int/lit8 v2, v2, 0x75

    goto :goto_37e

    :cond_379
    neg-int v3, v2

    or-int/2addr v2, v3

    const/16 v3, 0x1f

    shr-int/2addr v2, v3

    :goto_37e
    not-int v3, v2

    and-int/2addr v1, v3

    and-int v2, v17, v2

    xor-int v3, v1, v2

    and-int/2addr v1, v2

    or-int v2, v3, v1

    goto :goto_38a

    :cond_388
    move/from16 v17, v2

    :goto_38a
    const v1, -0x166053d3

    :try_start_38d
    invoke-static {v1}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3d0

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v1

    int-to-char v1, v1

    invoke-static {v3, v3}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v6

    add-int/lit16 v3, v6, 0xfb3

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v6

    const/16 v7, 0x10

    shr-int/2addr v6, v7

    rsub-int/lit8 v33, v6, 0x13

    const v34, -0x68299748

    const/16 v35, 0x0

    sget v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->$$b:I

    and-int/lit8 v6, v6, 0x7

    int-to-byte v6, v6

    neg-int v7, v6

    int-to-byte v7, v7

    add-int/lit8 v10, v7, 0x1

    int-to-byte v10, v10

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v6, v7, v10, v12}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->a(BBI[Ljava/lang/Object;)V

    const/4 v6, 0x0

    aget-object v7, v12, v6

    move-object/from16 v36, v7

    check-cast v36, Ljava/lang/String;

    new-array v7, v6, [Ljava/lang/Class;

    move/from16 v31, v1

    move/from16 v32, v3

    move-object/from16 v37, v7

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    :cond_3d0
    check-cast v1, Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6
    :try_end_3dd
    .catchall {:try_start_38d .. :try_end_3dd} :catchall_81d

    const v1, 0x1dd049f9

    int-to-long v10, v1

    const/16 v1, 0x2a5

    int-to-long v12, v1

    mul-long/2addr v12, v10

    const/16 v1, -0x2a3

    int-to-long v14, v1

    mul-long/2addr v14, v6

    add-long/2addr v12, v14

    const/16 v1, -0x2a4

    int-to-long v14, v1

    or-long v25, v10, v4

    xor-long v27, v6, v22

    or-long v25, v25, v27

    mul-long v14, v14, v25

    add-long/2addr v12, v14

    const/16 v1, 0x2a4

    int-to-long v14, v1

    or-long v25, v27, v10

    xor-long v25, v25, v22

    or-long v31, v29, v10

    xor-long v31, v31, v22

    or-long v25, v25, v31

    mul-long v25, v25, v14

    add-long v12, v12, v25

    xor-long v25, v10, v22

    or-long v25, v25, v27

    xor-long v25, v25, v22

    or-long v27, v27, v29

    xor-long v27, v27, v22

    or-long v25, v25, v27

    or-long/2addr v6, v10

    or-long/2addr v6, v4

    xor-long v6, v6, v22

    or-long v6, v25, v6

    mul-long/2addr v14, v6

    add-long/2addr v12, v14

    const v1, 0x1aaa580f

    int-to-long v6, v1

    add-long/2addr v12, v6

    const/16 v1, 0x20

    shr-long v6, v12, v1

    long-to-int v1, v6

    const v3, 0x6ffa7bfd

    or-int/2addr v3, v8

    mul-int/lit16 v3, v3, 0xb8

    const v6, -0x405255f6

    add-int/2addr v6, v3

    const v3, 0x6372717c

    or-int/2addr v3, v8

    not-int v3, v3

    const v7, 0x6eba6aad

    or-int/2addr v3, v7

    mul-int/lit16 v3, v3, 0xb8

    add-int/2addr v6, v3

    sget v3, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    and-int/lit8 v7, v3, 0x49

    or-int/lit8 v3, v3, 0x49

    add-int/2addr v7, v3

    rem-int/lit16 v3, v7, 0x80

    sput v3, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    const/4 v3, 0x2

    rem-int/2addr v7, v3

    and-int/2addr v1, v6

    long-to-int v3, v12

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v6

    not-int v7, v6

    const v10, -0x5f6d2555

    or-int/2addr v7, v10

    not-int v7, v7

    const v11, 0x15052054

    or-int/2addr v7, v11

    mul-int/lit16 v7, v7, -0xf5

    const v11, 0x4d4319c4

    add-int/2addr v11, v7

    or-int/2addr v6, v10

    not-int v6, v6

    mul-int/lit16 v7, v6, -0xf5

    add-int/2addr v11, v7

    const v7, 0x4ae88501    # 7619200.5f

    or-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0xf5

    add-int/2addr v11, v6

    and-int/2addr v3, v11

    or-int/2addr v1, v3

    and-int/lit16 v3, v0, 0x10a

    not-int v3, v3

    or-int/lit16 v6, v0, 0x10a

    and-int/2addr v3, v6

    neg-int v6, v1

    xor-int v7, v1, v6

    and-int/2addr v1, v6

    or-int/2addr v1, v7

    const/16 v6, 0x1f

    shr-int/2addr v1, v6

    not-int v6, v1

    and-int/2addr v6, v0

    and-int/2addr v1, v3

    xor-int v3, v6, v1

    and-int/2addr v1, v6

    or-int/2addr v1, v3

    not-int v3, v2

    and-int/2addr v3, v0

    and-int v6, v2, v8

    or-int/2addr v3, v6

    neg-int v6, v3

    or-int/2addr v3, v6

    const/16 v6, 0x1f

    shr-int/2addr v3, v6

    not-int v6, v3

    and-int/2addr v1, v6

    and-int/2addr v2, v3

    xor-int v3, v1, v2

    and-int/2addr v1, v2

    or-int/2addr v1, v3

    const/high16 v2, 0x80000

    and-int v2, p1, v2

    const/4 v3, 0x3

    if-nez v2, :cond_60c

    const v2, 0x6ff60c9c

    :try_start_49c
    invoke-static {v2}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4e7

    const/4 v6, 0x0

    invoke-static {v6}, Landroid/telephony/cdma/CdmaCellLocation;->convertQuartSecToDecDegrees(I)D

    move-result-wide v10

    const-wide/16 v6, 0x0

    cmpl-double v2, v10, v6

    add-int/lit16 v2, v2, 0x7b73

    int-to-char v2, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v6

    const/16 v7, 0x10

    shr-int/2addr v6, v7

    add-int/lit16 v6, v6, 0xe6e

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v7

    add-int/lit8 v33, v7, 0x1c

    const v34, 0x11bfc809

    const/16 v35, 0x0

    sget v7, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->$$b:I

    and-int/lit8 v7, v7, 0x7

    int-to-byte v7, v7

    neg-int v10, v7

    int-to-byte v10, v10

    add-int/lit8 v11, v10, 0x1

    int-to-byte v11, v11

    const/4 v12, 0x1

    new-array v13, v12, [Ljava/lang/Object;

    invoke-static {v7, v10, v11, v13}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->a(BBI[Ljava/lang/Object;)V

    const/4 v7, 0x0

    aget-object v10, v13, v7

    move-object/from16 v36, v10

    check-cast v36, Ljava/lang/String;

    new-array v10, v7, [Ljava/lang/Class;

    move/from16 v31, v2

    move/from16 v32, v6

    move-object/from16 v37, v10

    invoke-static/range {v31 .. v37}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    :cond_4e7
    check-cast v2, Ljava/lang/reflect/Method;

    const/4 v6, 0x0

    invoke-virtual {v2, v6, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6
    :try_end_4f4
    .catchall {:try_start_49c .. :try_end_4f4} :catchall_81d

    const v2, -0x1897c09e

    int-to-long v10, v2

    const/16 v2, -0x295

    int-to-long v12, v2

    mul-long v14, v12, v10

    mul-long/2addr v12, v6

    add-long/2addr v14, v12

    const/16 v2, 0x52c

    int-to-long v12, v2

    xor-long v19, v10, v22

    xor-long v25, v6, v22

    or-long v27, v19, v25

    xor-long v27, v27, v22

    or-long v27, v29, v27

    mul-long v12, v12, v27

    add-long/2addr v14, v12

    const/16 v2, -0x52c

    int-to-long v12, v2

    or-long v27, v10, v4

    xor-long v27, v27, v22

    or-long v31, v6, v4

    xor-long v31, v31, v22

    or-long v27, v27, v31

    mul-long v12, v12, v27

    add-long/2addr v14, v12

    const/16 v2, 0x296

    int-to-long v12, v2

    or-long v6, v19, v6

    xor-long v6, v6, v22

    or-long v10, v25, v10

    xor-long v10, v10, v22

    or-long/2addr v6, v10

    mul-long/2addr v12, v6

    add-long/2addr v14, v12

    const v2, -0x2ca01716

    int-to-long v6, v2

    add-long/2addr v14, v6

    const/16 v2, 0x20

    shr-long v6, v14, v2

    long-to-int v2, v6

    const v6, -0x5e04d86c

    or-int v7, v6, v8

    not-int v7, v7

    const v10, -0x85a82c1

    or-int v11, v10, v0

    not-int v11, v11

    or-int/2addr v7, v11

    mul-int/lit16 v7, v7, 0x14d

    const v11, 0x2ba0bebb

    add-int/2addr v11, v7

    or-int/2addr v6, v0

    not-int v6, v6

    or-int v7, v8, v10

    not-int v7, v7

    or-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x14d

    add-int/2addr v11, v6

    and-int/2addr v2, v11

    long-to-int v6, v14

    const v7, -0x6094c185

    or-int v10, v7, v0

    not-int v10, v10

    const v11, 0xaea6bda

    or-int/2addr v10, v11

    mul-int/lit8 v10, v10, 0x38

    const v12, 0x631c66dd

    add-int/2addr v10, v12

    or-int/2addr v11, v8

    not-int v11, v11

    or-int/2addr v7, v11

    mul-int/lit8 v7, v7, 0x38

    add-int/2addr v10, v7

    and-int/2addr v6, v10

    xor-int v7, v2, v6

    and-int/2addr v2, v6

    or-int/2addr v2, v7

    if-lez v2, :cond_5ba

    if-ne v2, v3, :cond_57a

    const/high16 v6, 0x10000000

    and-int v6, p1, v6

    if-nez v6, :cond_5ba

    :cond_57a
    and-int/lit16 v6, v0, 0x118

    not-int v6, v6

    or-int/lit16 v7, v0, 0x118

    and-int/2addr v6, v7

    and-int v7, v0, v1

    not-int v7, v7

    or-int v10, v0, v1

    and-int/2addr v7, v10

    sget v10, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    add-int/lit8 v10, v10, 0x31

    rem-int/lit16 v11, v10, 0x80

    sput v11, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    const/4 v12, 0x2

    rem-int/2addr v10, v12

    if-nez v10, :cond_59b

    neg-int v10, v7

    xor-int v12, v7, v10

    and-int/2addr v7, v10

    or-int/2addr v7, v12

    const/16 v10, 0x30

    ushr-int/2addr v7, v10

    goto :goto_5a3

    :cond_59b
    neg-int v10, v7

    xor-int v12, v7, v10

    and-int/2addr v7, v10

    or-int/2addr v7, v12

    const/16 v10, 0x1f

    shr-int/2addr v7, v10

    :goto_5a3
    not-int v10, v7

    and-int/2addr v6, v10

    and-int/2addr v1, v7

    xor-int v7, v6, v1

    and-int/2addr v1, v6

    or-int/2addr v1, v7

    and-int/lit8 v6, v11, 0x15

    or-int/lit8 v7, v11, 0x15

    add-int/2addr v6, v7

    rem-int/lit16 v7, v6, 0x80

    sput v7, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    const/4 v7, 0x2

    rem-int/2addr v6, v7

    if-eqz v6, :cond_5ba

    const/4 v6, 0x3

    const/4 v7, 0x4

    rem-int/2addr v6, v7

    :cond_5ba
    xor-int/lit16 v6, v0, 0x11f

    not-int v2, v2

    neg-int v7, v2

    xor-int v10, v2, v7

    and-int/2addr v2, v7

    or-int/2addr v2, v10

    const/16 v7, 0x1f

    shr-int/2addr v2, v7

    not-int v7, v2

    and-int/2addr v6, v7

    and-int/2addr v2, v0

    sget v7, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    or-int/lit8 v10, v7, 0x6b

    const/4 v11, 0x1

    shl-int/2addr v10, v11

    xor-int/lit8 v7, v7, 0x6b

    sub-int/2addr v10, v7

    rem-int/lit16 v7, v10, 0x80

    sput v7, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    const/4 v11, 0x2

    rem-int/2addr v10, v11

    if-nez v10, :cond_5e4

    or-int/2addr v2, v6

    xor-int v6, v0, v1

    neg-int v10, v6

    xor-int v11, v6, v10

    and-int/2addr v6, v10

    or-int/2addr v6, v11

    const/16 v10, 0x8

    goto :goto_5f4

    :cond_5e4
    xor-int v10, v6, v2

    and-int/2addr v2, v6

    or-int/2addr v2, v10

    not-int v6, v1

    and-int/2addr v6, v0

    and-int v10, v1, v8

    or-int/2addr v6, v10

    neg-int v10, v6

    xor-int v11, v6, v10

    and-int/2addr v6, v10

    or-int/2addr v6, v11

    const/16 v10, 0x1f

    :goto_5f4
    add-int/lit8 v7, v7, 0x35

    rem-int/lit16 v11, v7, 0x80

    sput v11, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    const/4 v11, 0x2

    rem-int/2addr v7, v11

    if-eqz v7, :cond_604

    shl-int/2addr v6, v10

    not-int v7, v6

    and-int/2addr v2, v7

    and-int/2addr v1, v6

    or-int/2addr v1, v2

    goto :goto_60c

    :cond_604
    shr-int/2addr v6, v10

    not-int v7, v6

    and-int/2addr v2, v7

    and-int/2addr v1, v6

    xor-int v6, v2, v1

    and-int/2addr v1, v2

    or-int/2addr v1, v6

    :cond_60c
    :goto_60c
    const/16 v2, 0x10

    new-array v6, v2, [B

    :try_start_610
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v2

    const v7, -0x4753e7a7

    invoke-static {v7}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_659

    const/4 v10, 0x0

    invoke-static {v10}, Landroid/graphics/Color;->green(I)I

    move-result v7

    int-to-char v11, v7

    invoke-static {v10, v10}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v7

    rsub-int v12, v7, 0x770

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v7

    shr-int/lit8 v7, v7, 0x8

    add-int/lit8 v13, v7, 0x2b

    const v14, -0x391a2334

    sget v7, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->$$b:I

    and-int/lit8 v7, v7, 0x7

    int-to-byte v7, v7

    neg-int v10, v7

    int-to-byte v10, v10

    add-int/lit8 v9, v10, 0x1

    int-to-byte v9, v9

    const/4 v3, 0x1

    new-array v15, v3, [Ljava/lang/Object;

    invoke-static {v7, v10, v9, v15}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->a(BBI[Ljava/lang/Object;)V

    const/4 v7, 0x0

    aget-object v9, v15, v7

    move-object/from16 v16, v9

    check-cast v16, Ljava/lang/String;

    new-array v9, v3, [Ljava/lang/Class;

    const-class v3, [B

    aput-object v3, v9, v7

    const/4 v3, 0x0

    move v15, v3

    move-object/from16 v17, v9

    invoke-static/range {v11 .. v17}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    :cond_659
    check-cast v7, Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    invoke-virtual {v7, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2
    :try_end_666
    .catchall {:try_start_610 .. :try_end_666} :catchall_81d

    const v7, -0xec19bcb

    int-to-long v10, v7

    const/16 v7, -0x151

    int-to-long v12, v7

    mul-long/2addr v12, v10

    const/16 v7, 0x153

    int-to-long v14, v7

    mul-long/2addr v14, v2

    add-long/2addr v12, v14

    const/16 v7, -0x152

    int-to-long v14, v7

    xor-long v16, v10, v22

    or-long v25, v16, v29

    xor-long v25, v25, v22

    xor-long v27, v2, v22

    or-long v27, v27, v10

    xor-long v27, v27, v22

    or-long v27, v25, v27

    or-long v29, v10, v4

    xor-long v29, v29, v22

    or-long v27, v27, v29

    mul-long v14, v14, v27

    add-long/2addr v12, v14

    const/16 v7, 0x152

    int-to-long v14, v7

    or-long v16, v16, v2

    xor-long v16, v16, v22

    mul-long v16, v16, v14

    add-long v12, v12, v16

    or-long/2addr v2, v10

    or-long/2addr v2, v4

    xor-long v2, v2, v22

    or-long v2, v25, v2

    mul-long/2addr v14, v2

    add-long/2addr v12, v14

    const v2, 0x429d9e46

    int-to-long v2, v2

    add-long/2addr v12, v2

    const/16 v2, 0x20

    shr-long v2, v12, v2

    long-to-int v2, v2

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v3

    const v4, -0x465c9a01

    or-int/2addr v4, v3

    not-int v4, v4

    const v5, 0xf4dbbaa

    or-int/2addr v4, v5

    mul-int/lit16 v4, v4, -0x16e

    const v5, 0x572e81aa

    add-int/2addr v5, v4

    const v4, -0x40100001    # -1.8749999f

    or-int/2addr v3, v4

    not-int v3, v3

    const v4, 0x90121aa

    or-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x16e

    add-int/2addr v5, v3

    and-int/2addr v2, v5

    long-to-int v3, v12

    const v4, -0x1081c097

    or-int/2addr v4, v0

    not-int v4, v4

    const v5, -0x662c1641

    or-int/2addr v5, v0

    not-int v5, v5

    or-int/2addr v4, v5

    mul-int/lit8 v4, v4, 0x45

    const v5, 0x3ae97e12

    add-int/2addr v5, v4

    const v4, 0x6e6c3648

    or-int/2addr v4, v0

    not-int v4, v4

    const v7, -0x7eedf6df

    or-int/2addr v4, v7

    const v7, 0x18c1e09e

    or-int/2addr v7, v0

    not-int v7, v7

    or-int/2addr v4, v7

    mul-int/lit8 v4, v4, -0x45

    add-int/2addr v5, v4

    const v4, 0x3948a228

    add-int/2addr v5, v4

    and-int/2addr v3, v5

    xor-int v4, v2, v3

    and-int/2addr v2, v3

    or-int/2addr v2, v4

    and-int/lit16 v3, v0, 0x139

    not-int v3, v3

    or-int/lit16 v4, v0, 0x139

    and-int/2addr v3, v4

    neg-int v4, v2

    xor-int v5, v2, v4

    and-int/2addr v2, v4

    or-int/2addr v2, v5

    const/16 v4, 0x1f

    shr-int/2addr v2, v4

    not-int v4, v2

    and-int/2addr v4, v0

    and-int/2addr v2, v3

    xor-int v3, v4, v2

    and-int/2addr v2, v4

    or-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-static {v6, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    not-int v4, v1

    and-int/2addr v4, v0

    and-int v6, v1, v8

    or-int/2addr v4, v6

    neg-int v6, v4

    or-int/2addr v4, v6

    const/16 v6, 0x1f

    shr-int/2addr v4, v6

    sget v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    xor-int/lit8 v7, v6, 0x67

    and-int/lit8 v6, v6, 0x67

    const/4 v10, 0x1

    shl-int/2addr v6, v10

    add-int/2addr v7, v6

    rem-int/lit16 v6, v7, 0x80

    sput v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->IconCompatParcelizer:I

    const/4 v11, 0x2

    rem-int/2addr v7, v11

    and-int/2addr v4, v10

    neg-int v7, v4

    xor-int v11, v4, v7

    and-int/2addr v7, v4

    or-int/2addr v7, v11

    const/16 v11, 0x1f

    shr-int/2addr v7, v11

    not-int v7, v7

    and-int/2addr v7, v10

    aput-object v3, v5, v4

    const/4 v3, 0x0

    aput-object v3, v5, v7

    const/4 v3, 0x0

    aget-object v4, v5, v3

    check-cast v4, [Ljava/lang/String;

    and-int v3, v0, v1

    not-int v3, v3

    or-int v5, v0, v1

    and-int/2addr v3, v5

    neg-int v5, v3

    xor-int v7, v3, v5

    and-int/2addr v3, v5

    or-int/2addr v3, v7

    const/16 v5, 0x1f

    shr-int/2addr v3, v5

    not-int v5, v3

    and-int/2addr v2, v5

    and-int/2addr v1, v3

    xor-int v3, v2, v1

    and-int/2addr v1, v2

    or-int/2addr v1, v3

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    new-array v5, v3, [I

    aput-object v5, v2, v3

    new-array v5, v3, [I

    const/4 v7, 0x2

    aput-object v5, v2, v7

    new-array v7, v3, [I

    const/4 v9, 0x3

    aput-object v7, v2, v9

    xor-int/lit8 v9, v6, 0x11

    and-int/lit8 v6, v6, 0x11

    shl-int/2addr v6, v3

    add-int/2addr v9, v6

    rem-int/lit16 v3, v9, 0x80

    sput v3, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->RemoteActionCompatParcelizer:I

    const/4 v3, 0x2

    rem-int/2addr v9, v3

    and-int v3, v0, v1

    not-int v3, v3

    or-int v6, v0, v1

    and-int/2addr v3, v6

    neg-int v6, v3

    xor-int v9, v3, v6

    and-int/2addr v3, v6

    or-int/2addr v3, v9

    const/16 v6, 0x1f

    shr-int/2addr v3, v6

    const/16 v6, 0x10

    and-int/2addr v3, v6

    check-cast v5, [I

    const/4 v6, 0x0

    aput v0, v5, v6

    check-cast v7, [I

    aput v1, v7, v6

    aput-object v4, v2, v6

    const v1, -0x6768952b

    or-int v4, v1, v8

    not-int v4, v4

    mul-int/lit16 v4, v4, 0x3d3

    const v5, -0x5f10ab98

    add-int/2addr v5, v4

    const v4, 0xe48be7b

    or-int v6, v0, v4

    mul-int/lit16 v6, v6, -0x3d3

    add-int/2addr v5, v6

    or-int/2addr v0, v1

    not-int v0, v0

    or-int v1, v8, v4

    not-int v1, v1

    or-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3d3

    add-int/2addr v5, v0

    neg-int v0, v3

    neg-int v0, v0

    or-int v1, v5, v0

    const/4 v3, 0x1

    shl-int/2addr v1, v3

    xor-int/2addr v0, v5

    sub-int/2addr v1, v0

    invoke-static {}, Lo/getColorInfoString;->write()I

    move-result v0

    mul-int/lit16 v3, v1, 0x177

    move/from16 v4, p2

    mul-int/lit16 v5, v4, -0x2eb

    neg-int v5, v5

    neg-int v5, v5

    and-int v6, v3, v5

    or-int/2addr v3, v5

    add-int/2addr v6, v3

    not-int v3, v1

    xor-int v5, v3, v4

    and-int v7, v3, v4

    or-int/2addr v5, v7

    not-int v5, v5

    not-int v7, v0

    xor-int v8, v7, v1

    and-int/2addr v7, v1

    or-int/2addr v7, v8

    not-int v7, v7

    or-int/2addr v5, v7

    mul-int/lit16 v5, v5, -0x176

    or-int v7, v6, v5

    const/4 v8, 0x1

    shl-int/2addr v7, v8

    xor-int/2addr v5, v6

    sub-int/2addr v7, v5

    not-int v4, v4

    xor-int v5, v4, v1

    and-int v6, v4, v1

    or-int/2addr v5, v6

    not-int v5, v5

    mul-int/lit16 v5, v5, 0x2ec

    and-int v6, v7, v5

    or-int/2addr v5, v7

    add-int/2addr v6, v5

    or-int/2addr v3, v4

    not-int v3, v3

    not-int v0, v0

    xor-int v4, v0, v1

    and-int/2addr v0, v1

    or-int/2addr v0, v4

    not-int v0, v0

    xor-int v1, v3, v0

    and-int/2addr v0, v3

    or-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x176

    not-int v0, v0

    sub-int/2addr v6, v0

    const/4 v0, 0x1

    sub-int/2addr v6, v0

    shl-int/lit8 v0, v6, 0xd

    not-int v1, v0

    and-int/2addr v1, v6

    not-int v3, v6

    and-int/2addr v0, v3

    or-int/2addr v0, v1

    ushr-int/lit8 v1, v0, 0x11

    not-int v3, v1

    and-int/2addr v3, v0

    not-int v0, v0

    and-int/2addr v0, v1

    or-int/2addr v0, v3

    shl-int/lit8 v1, v0, 0x5

    not-int v3, v1

    and-int/2addr v3, v0

    not-int v0, v0

    and-int/2addr v0, v1

    or-int/2addr v0, v3

    const/4 v1, 0x1

    aget-object v1, v2, v1

    check-cast v1, [I

    const/4 v3, 0x0

    aput v0, v1, v3

    return-object v2

    :catchall_81d
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_825

    throw v1

    :cond_825
    throw v0
.end method

.method private static a(BBI[Ljava/lang/Object;)V
    .registers 8

    .line 0
    sget-object v0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;->$$a:[B

    add-int/lit8 p1, p1, 0x4

    mul-int/lit8 p0, p0, 0x27

    add-int/lit8 p0, p0, 0x4b

    mul-int/lit8 p2, p2, 0x3

    rsub-int/lit8 v1, p2, 0x4

    new-array v1, v1, [B

    rsub-int/lit8 p2, p2, 0x3

    const/4 v2, -0x1

    if-nez v0, :cond_16

    move v3, p0

    move p0, p2

    goto :goto_2a

    :cond_16
    :goto_16
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v2, v2, 0x1

    int-to-byte v3, p0

    aput-byte v3, v1, v2

    if-ne v2, p2, :cond_28

    new-instance p0, Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, v1, p1}, Ljava/lang/String;-><init>([BI)V

    aput-object p0, p3, p1

    return-void

    :cond_28
    aget-byte v3, v0, p1

    :goto_2a
    add-int/2addr p0, v3

    add-int/lit8 p0, p0, 0x6

    goto :goto_16
.end method

###### Class com.fasterxml.jackson.databind.jdk14.JDK14Util.RecordAccessor (com.fasterxml.jackson.databind.jdk14.JDK14Util$RecordAccessor)
.class Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/jdk14/JDK14Util;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RecordAccessor"
.end annotation


# static fields
.field private static final INSTANCE:Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;

.field private static final PROBLEM:Ljava/lang/RuntimeException;


# instance fields
.field private final RECORD_COMPONENT_GET_NAME:Ljava/lang/reflect/Method;

.field private final RECORD_COMPONENT_GET_TYPE:Ljava/lang/reflect/Method;

.field private final RECORD_GET_RECORD_COMPONENTS:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x0

    .line 55
    :try_start_1
    new-instance v1, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;

    invoke-direct {v1}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;-><init>()V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_6} :catch_a

    move-object v2, v1

    move-object v1, v0

    move-object v0, v2

    goto :goto_b

    :catch_a
    move-exception v1

    .line 59
    :goto_b
    sput-object v0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->INSTANCE:Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;

    .line 60
    sput-object v1, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->PROBLEM:Ljava/lang/RuntimeException;

    return-void
.end method

.method private constructor <init>()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    :try_start_3
    const-class v0, Ljava/lang/Class;

    const-string v1, "getRecordComponents"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->RECORD_GET_RECORD_COMPONENTS:Ljava/lang/reflect/Method;

    .line 66
    const-string v0, "java.lang.reflect.RecordComponent"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 67
    const-string v1, "getName"

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->RECORD_COMPONENT_GET_NAME:Ljava/lang/reflect/Method;

    .line 68
    const-string v1, "getType"

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->RECORD_COMPONENT_GET_TYPE:Ljava/lang/reflect/Method;
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_2a} :catch_2b

    return-void

    :catch_2b
    move-exception p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 70
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to access Methods needed to support `java.lang.Record`: (%s) %s"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static instance()Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;
    .registers 1

    .line 77
    sget-object v0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->PROBLEM:Ljava/lang/RuntimeException;

    if-nez v0, :cond_7

    .line 80
    sget-object v0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->INSTANCE:Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;

    return-object v0

    .line 78
    :cond_7
    throw v0
.end method


# virtual methods
.method public getRecordFieldNames(Ljava/lang/Class;)[Ljava/lang/String;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 85
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->recordComponents(Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 90
    :cond_8
    array-length v1, v0

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    move v3, v2

    .line 91
    :goto_d
    array-length v4, v0

    if-ge v3, v4, :cond_3f

    .line 93
    :try_start_10
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->RECORD_COMPONENT_GET_NAME:Ljava/lang/reflect/Method;

    aget-object v5, v0, v3

    new-array v6, v2, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    aput-object v4, v1, v3
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_1e} :catch_21

    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :catch_21
    move-exception p0

    .line 97
    array-length v0, v0

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->nameOf(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 95
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to access name of field #%d (of %d) of Record type %s"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3f
    return-object v1
.end method

.method public getRecordFields(Ljava/lang/Class;)[Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)[",
            "Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 105
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->recordComponents(Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 110
    :cond_8
    array-length v1, v0

    new-array v1, v1, [Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;

    const/4 v2, 0x0

    move v3, v2

    .line 111
    :goto_d
    array-length v4, v0

    if-ge v3, v4, :cond_6e

    .line 114
    :try_start_10
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->RECORD_COMPONENT_GET_NAME:Ljava/lang/reflect/Method;

    aget-object v5, v0, v3

    new-array v6, v2, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_1c} :catch_50

    .line 122
    :try_start_1c
    iget-object v5, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->RECORD_COMPONENT_GET_TYPE:Ljava/lang/reflect/Method;

    aget-object v6, v0, v3

    new-array v7, v2, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_28} :catch_32

    .line 128
    new-instance v6, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;

    invoke-direct {v6, v5, v4}, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RawTypeName;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v6, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :catch_32
    move-exception p0

    .line 126
    array-length v0, v0

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->nameOf(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 124
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to access type of field #%d (of %d) of Record type %s"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_50
    move-exception p0

    .line 118
    array-length v0, v0

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->nameOf(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 116
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to access name of field #%d (of %d) of Record type %s"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_6e
    return-object v1
.end method

.method protected recordComponents(Ljava/lang/Class;)[Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 136
    :try_start_0
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/jdk14/JDK14Util$RecordAccessor;->RECORD_GET_RECORD_COMPONENTS:Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_b} :catch_c

    return-object p0

    :catch_c
    move-exception p0

    .line 138
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/util/NativeImageUtil;->isUnsupportedFeatureError(Ljava/lang/Throwable;)Z

    move-result p0

    if-eqz p0, :cond_15

    const/4 p0, 0x0

    return-object p0

    .line 141
    :cond_15
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Failed to access RecordComponents of type "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->nameOf(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
