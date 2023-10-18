package org.babyfish.jimmer.sql.fetcher.impl;

import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.Field;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public interface FetcherImplementor<E> extends Fetcher<E> {

    @Override
    FetcherImplementor<E> allScalarFields();

    @Override
    FetcherImplementor<E> allTableFields();

    @Override
    @NewChain
    FetcherImplementor<E> add(String prop);

    @Override
    @NewChain
    FetcherImplementor<E> add(
            String prop,
            Fetcher<?> childFetcher
    );

    @Override
    @NewChain
    FetcherImplementor<E> add(
            String prop,
            Fetcher<?> childFetcher,
            Consumer<? extends FieldConfig<?, ? extends Table<?>>> loaderBlock
    );

    @Override
    @NewChain
    FetcherImplementor<E> add(String prop, IdOnlyFetchType idOnlyFetchType);

    @Override
    @NewChain
    FetcherImplementor<E> remove(String prop);

    /**
     * Are all fetched properties simple fields?
     * @return Checked result
     */
    boolean __isSimpleFetcher();

    Map<String, Field> __unresolvedFieldMap();

    List<PropId> __shownPropIds();

    List<PropId> __hiddenPropIds();
}
