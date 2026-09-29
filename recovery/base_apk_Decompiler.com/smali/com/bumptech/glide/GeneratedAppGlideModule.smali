###### Class com.bumptech.glide.GeneratedAppGlideModule (com.bumptech.glide.GeneratedAppGlideModule)
.class abstract Lcom/bumptech/glide/GeneratedAppGlideModule;
.super Lo/getFirstMediaPeriodInfo;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .registers 1

    .line 16
    invoke-direct {p0}, Lo/getFirstMediaPeriodInfo;-><init>()V

    return-void
.end method


# virtual methods
.method AudioAttributesCompatParcelizer()Lo/canKeepMediaPeriodHolder$write;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method IconCompatParcelizer()Ljava/util/Set;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 20
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    return-object p0
.end method
