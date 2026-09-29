###### Class com.bumptech.glide.GeneratedAppGlideModuleImpl (com.bumptech.glide.GeneratedAppGlideModuleImpl)
.class final Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;
.super Lcom/bumptech/glide/GeneratedAppGlideModule;
.source "SourceFile"


# instance fields
.field private final AudioAttributesCompatParcelizer:Lcom/marrow/MarrowAppGlideModule;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 15
    invoke-direct {p0}, Lcom/bumptech/glide/GeneratedAppGlideModule;-><init>()V

    .line 16
    new-instance p1, Lcom/marrow/MarrowAppGlideModule;

    invoke-direct {p1}, Lcom/marrow/MarrowAppGlideModule;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->AudioAttributesCompatParcelizer:Lcom/marrow/MarrowAppGlideModule;

    return-void
.end method

.method private static read()Lo/setMetadata;
    .registers 1

    .line 49
    new-instance v0, Lo/setMetadata;

    invoke-direct {v0}, Lo/setMetadata;-><init>()V

    return-object v0
.end method


# virtual methods
.method final synthetic AudioAttributesCompatParcelizer()Lo/canKeepMediaPeriodHolder$write;
    .registers 1

    .line 11
    invoke-static {}, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->read()Lo/setMetadata;

    move-result-object p0

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/util/Set;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 43
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public final IconCompatParcelizer(Landroid/content/Context;Lcom/bumptech/glide/Glide;Lo/setSelectionFlags;)V
    .registers 5

    .line 31
    new-instance v0, Lo/onSeekBackIncrementChanged;

    invoke-direct {v0}, Lo/onSeekBackIncrementChanged;-><init>()V

    invoke-virtual {v0, p1, p2, p3}, Lo/getFollowingMediaPeriodInfo;->IconCompatParcelizer(Landroid/content/Context;Lcom/bumptech/glide/Glide;Lo/setSelectionFlags;)V

    .line 32
    iget-object p0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->AudioAttributesCompatParcelizer:Lcom/marrow/MarrowAppGlideModule;

    invoke-virtual {p0, p1, p2, p3}, Lo/getFollowingMediaPeriodInfo;->IconCompatParcelizer(Landroid/content/Context;Lcom/bumptech/glide/Glide;Lo/setSelectionFlags;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    .line 37
    iget-object p0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->AudioAttributesCompatParcelizer:Lcom/marrow/MarrowAppGlideModule;

    invoke-virtual {p0}, Lo/getFirstMediaPeriodInfo;->RemoteActionCompatParcelizer()Z

    move-result p0

    return p0
.end method
