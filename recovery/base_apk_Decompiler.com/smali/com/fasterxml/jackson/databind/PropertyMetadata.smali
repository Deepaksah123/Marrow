###### Class com.fasterxml.jackson.databind.PropertyMetadata (com.fasterxml.jackson.databind.PropertyMetadata)
.class public Lcom/fasterxml/jackson/databind/PropertyMetadata;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;
    }
.end annotation


# static fields
.field public static final STD_OPTIONAL:Lcom/fasterxml/jackson/databind/PropertyMetadata;

.field public static final STD_REQUIRED:Lcom/fasterxml/jackson/databind/PropertyMetadata;

.field public static final STD_REQUIRED_OR_OPTIONAL:Lcom/fasterxml/jackson/databind/PropertyMetadata;


# instance fields
.field protected _contentNulls:Lcom/fasterxml/jackson/annotation/Nulls;

.field protected final _defaultValue:Ljava/lang/String;

.field protected final _description:Ljava/lang/String;

.field protected final _index:Ljava/lang/Integer;

.field protected final transient _mergeInfo:Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;

.field protected final _required:Ljava/lang/Boolean;

.field protected _valueNulls:Lcom/fasterxml/jackson/annotation/Nulls;


# direct methods
.method static constructor <clinit>()V
    .registers 17

    .line 19
    new-instance v8, Lcom/fasterxml/jackson/databind/PropertyMetadata;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/PropertyMetadata;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;Lcom/fasterxml/jackson/annotation/Nulls;Lcom/fasterxml/jackson/annotation/Nulls;)V

    sput-object v8, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_REQUIRED:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    .line 22
    new-instance v0, Lcom/fasterxml/jackson/databind/PropertyMetadata;

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Lcom/fasterxml/jackson/databind/PropertyMetadata;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;Lcom/fasterxml/jackson/annotation/Nulls;Lcom/fasterxml/jackson/annotation/Nulls;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_OPTIONAL:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    .line 25
    new-instance v0, Lcom/fasterxml/jackson/databind/PropertyMetadata;

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/fasterxml/jackson/databind/PropertyMetadata;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;Lcom/fasterxml/jackson/annotation/Nulls;Lcom/fasterxml/jackson/annotation/Nulls;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_REQUIRED_OR_OPTIONAL:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;Lcom/fasterxml/jackson/annotation/Nulls;Lcom/fasterxml/jackson/annotation/Nulls;)V
    .registers 8

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_required:Ljava/lang/Boolean;

    .line 124
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_description:Ljava/lang/String;

    .line 125
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_index:Ljava/lang/Integer;

    if-eqz p4, :cond_11

    .line 126
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_12

    :cond_11
    const/4 p4, 0x0

    :cond_12
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_defaultValue:Ljava/lang/String;

    .line 127
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_mergeInfo:Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;

    .line 128
    iput-object p6, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_valueNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    .line 129
    iput-object p7, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_contentNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    return-void
.end method

.method public static construct(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/PropertyMetadata;
    .registers 13

    if-nez p1, :cond_17

    if-nez p2, :cond_17

    if-nez p3, :cond_17

    if-nez p0, :cond_b

    .line 142
    sget-object p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_REQUIRED_OR_OPTIONAL:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    return-object p0

    .line 144
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_14

    sget-object p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_REQUIRED:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    return-object p0

    :cond_14
    sget-object p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_OPTIONAL:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    return-object p0

    .line 138
    :cond_17
    new-instance v8, Lcom/fasterxml/jackson/databind/PropertyMetadata;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/PropertyMetadata;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;Lcom/fasterxml/jackson/annotation/Nulls;Lcom/fasterxml/jackson/annotation/Nulls;)V

    return-object v8
.end method


# virtual methods
.method public getContentNulls()Lcom/fasterxml/jackson/annotation/Nulls;
    .registers 1

    .line 274
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_contentNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    return-object p0
.end method

.method public getIndex()Ljava/lang/Integer;
    .registers 1

    .line 254
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_index:Ljava/lang/Integer;

    return-object p0
.end method

.method public getMergeInfo()Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;
    .registers 1

    .line 264
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_mergeInfo:Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;

    return-object p0
.end method

.method public getValueNulls()Lcom/fasterxml/jackson/annotation/Nulls;
    .registers 1

    .line 269
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_valueNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    return-object p0
.end method

.method public hasIndex()Z
    .registers 1

    .line 259
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_index:Ljava/lang/Integer;

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public isRequired()Z
    .registers 1

    .line 247
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_required:Ljava/lang/Boolean;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method protected readResolve()Ljava/lang/Object;
    .registers 2

    .line 163
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_description:Ljava/lang/String;

    if-nez v0, :cond_2a

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_index:Ljava/lang/Integer;

    if-nez v0, :cond_2a

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_defaultValue:Ljava/lang/String;

    if-nez v0, :cond_2a

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_mergeInfo:Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;

    if-nez v0, :cond_2a

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_valueNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    if-nez v0, :cond_2a

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_contentNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    if-nez v0, :cond_2a

    .line 166
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_required:Ljava/lang/Boolean;

    if-nez p0, :cond_1f

    .line 167
    sget-object p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_REQUIRED_OR_OPTIONAL:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    return-object p0

    .line 169
    :cond_1f
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_28

    sget-object p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_REQUIRED:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    return-object p0

    :cond_28
    sget-object p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->STD_OPTIONAL:Lcom/fasterxml/jackson/databind/PropertyMetadata;

    :cond_2a
    return-object p0
.end method

.method public withDescription(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/PropertyMetadata;
    .registers 11

    .line 175
    new-instance v8, Lcom/fasterxml/jackson/databind/PropertyMetadata;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_required:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_index:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_defaultValue:Ljava/lang/String;

    iget-object v5, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_mergeInfo:Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;

    iget-object v6, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_valueNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    iget-object v7, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_contentNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    move-object v0, v8

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/PropertyMetadata;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;Lcom/fasterxml/jackson/annotation/Nulls;Lcom/fasterxml/jackson/annotation/Nulls;)V

    return-object v8
.end method

.method public withMergeInfo(Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;)Lcom/fasterxml/jackson/databind/PropertyMetadata;
    .registers 11

    .line 183
    new-instance v8, Lcom/fasterxml/jackson/databind/PropertyMetadata;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_required:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_description:Ljava/lang/String;

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_index:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_defaultValue:Ljava/lang/String;

    iget-object v6, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_valueNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    iget-object v7, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_contentNulls:Lcom/fasterxml/jackson/annotation/Nulls;

    move-object v0, v8

    move-object v5, p1

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/PropertyMetadata;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;Lcom/fasterxml/jackson/annotation/Nulls;Lcom/fasterxml/jackson/annotation/Nulls;)V

    return-object v8
.end method

.method public withNulls(Lcom/fasterxml/jackson/annotation/Nulls;Lcom/fasterxml/jackson/annotation/Nulls;)Lcom/fasterxml/jackson/databind/PropertyMetadata;
    .registers 12

    .line 192
    new-instance v8, Lcom/fasterxml/jackson/databind/PropertyMetadata;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_required:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_description:Ljava/lang/String;

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_index:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_defaultValue:Ljava/lang/String;

    iget-object v5, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata;->_mergeInfo:Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;

    move-object v0, v8

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/PropertyMetadata;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;Lcom/fasterxml/jackson/annotation/Nulls;Lcom/fasterxml/jackson/annotation/Nulls;)V

    return-object v8
.end method

###### Class com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo (com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo)
.class public final Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/PropertyMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MergeInfo"
.end annotation


# instance fields
.field public final fromDefaults:Z

.field public final getter:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Z)V
    .registers 3

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;->getter:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 48
    iput-boolean p2, p0, Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;->fromDefaults:Z

    return-void
.end method

.method public static createForDefaults(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;
    .registers 3

    .line 52
    new-instance v0, Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;-><init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Z)V

    return-object v0
.end method

.method public static createForPropertyOverride(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;
    .registers 3

    .line 60
    new-instance v0, Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;-><init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Z)V

    return-object v0
.end method

.method public static createForTypeOverride(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;
    .registers 3

    .line 56
    new-instance v0, Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/fasterxml/jackson/databind/PropertyMetadata$MergeInfo;-><init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Z)V

    return-object v0
.end method
