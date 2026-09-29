###### Class androidx.databinding.MergedDataBinderMapper (androidx.databinding.MergedDataBinderMapper)
.class public Landroidx/databinding/MergedDataBinderMapper;
.super Lo/AnnotatedConstructor;
.source "SourceFile"


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/AnnotatedConstructor;",
            ">;"
        }
    .end annotation
.end field

.field private read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private write:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lo/AnnotatedConstructor;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 32
    invoke-direct {p0}, Lo/AnnotatedConstructor;-><init>()V

    .line 37
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/databinding/MergedDataBinderMapper;->write:Ljava/util/Set;

    .line 38
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/databinding/MergedDataBinderMapper;->AudioAttributesCompatParcelizer:Ljava/util/List;

    .line 43
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/databinding/MergedDataBinderMapper;->read:Ljava/util/List;

    return-void
.end method
